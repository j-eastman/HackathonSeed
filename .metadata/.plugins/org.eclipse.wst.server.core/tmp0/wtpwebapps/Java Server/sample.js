
// Define a new module for our app
var app = angular.module('predixModule', []);

// The main controller for the Predix Hackathon
app.controller('mainController', function($scope, $http) {
	// This will be called on page load
    $scope.getLimitedDataPoints = getLimitedDataPoints;
    $scope.token = "";
    /*
     * Get data from Predix - send the http request that will be mapped in our controller
     */
    function getLimitedDataPoints(){
    	// test
    	// Get the UAA authentication token
    	$http.get('/springmvc-helloworld/getAuthToken/')
    	
    	// If the request was successful
    	.success(function(authToken) {	
    		// Log auth token in console
    		//console.log(authToken);
    		$scope.token = authToken;
    		// Get data from predix using the token
    		var data = {
    				'tagNames': 'Engine Frequency,Engine Battery Voltage',
    				'startTime': '1y-ago'
    		}
    		var req = {
    				 method: 'POST',
    				 url: '/springmvc-helloworld/getLimitedDataPoints/',
    				 headers: {
    				   'Content-Type': 'application/json'
    				 },
    				 data: data
    				}

    				$http(req).then(function(data){console.log(data);}, function(data){console.log("Could not get the Predix data due to " + data);});
        	
    	})
    	// Error from getAuthToken request
    	.error(function(data) {
    		// Log error in console
    		console.log("Could not get the Auth Token due to " + data);
    	}); 
    	
    }
    
    // Call method on page load
  	getLimitedDataPoints();
 
       
	//end controller
});
