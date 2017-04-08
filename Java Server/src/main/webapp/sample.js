
// Define a new module for our app
var app = angular.module('predixModule', []);

// The main controller for the Predix Hackathon
app.controller('mainController', function($scope, $http) {
	// This will be called on page load
	$scope.engines = 
		[
			{
				ID: 1,
				DisplayedName: '2afbd553-8d7f-4c59-8346-d93a92b177ba', 
				PredixReference: '/engine/2afbd553-8d7f-4c59-8346-d93a92b177ba',
				Selected: 0
			},
			{
				ID: 2,
				DisplayedName: 'cb27ef1b-b0de-494d-877f-32e95b757651', 
				PredixReference: '/engine/cb27ef1b-b0de-494d-877f-32e95b757651',
				Selected: 0
			},
			{
				ID: 3,
				DisplayedName: '86d23000-3820-4d56-b755-6ea1302ddc4b', 
				PredixReference: '/engine/86d23000-3820-4d56-b755-6ea1302ddc4b',
				Selected: 0
			},
			{
				ID: 4,
				DisplayedName: '892e596d-3sds-4c9e-9094-078245931785', 
				PredixReference: '/engine/892e596d-3sds-4c9e-9094-078245931785',
				Selected: 0
			},
			{
				ID: 5,
				DisplayedName: '049bb0c2-fca8-4fc6-af28-558c57a1de86', 
				PredixReference: '/engine/049bb0c2-fca8-4fc6-af28-558c57a1de86',
				Selected: 0
			},
			{
				ID: 6,
				DisplayedName: '14727426-d32e-4feb-a2ec-a89f8c5ab100', 
				PredixReference: '/engine/14727426-d32e-4feb-a2ec-a89f8c5ab100',
				Selected: 0
			},
			{
				ID: 7,
				DisplayedName: '28880fbe-cb5a-40a7-a885-de4683528fbe', 
				PredixReference: '/engine/28880fbe-cb5a-40a7-a885-de4683528fbe',
				Selected: 0
			},
			{
				ID: 8,
				DisplayedName: '2afbd546-8d7f-4c59-8346-d93a92b177ba', 
				PredixReference: '/engine/2afbd546-8d7f-4c59-8346-d93a92b177ba',
				Selected: 0
			},
			{
				ID: 9,
				DisplayedName: '6f3cd880-2ad8-43ae-a194-08e2400be4bd', 
				PredixReference: '/engine/6f3cd880-2ad8-43ae-a194-08e2400be4bd',
				Selected: 0
			},
			{
				ID: 10,
				DisplayedName: '86d23000-3820-1234-b755-6ea1302ddc4b', 
				PredixReference: '/engine/86d23000-3820-1234-b755-6ea1302ddc4b',
				Selected: 0
			},
			{
				ID: 11,
				DisplayedName: '892e596d-e734-4c9e-9094-078245931785', 
				PredixReference: '/engine/892e596d-e734-4c9e-9094-078245931785',
				Selected: 0
			},
			{
				ID: 12,
				DisplayedName: '8c12e00a-7d73-42a5-aef3-8f87298d6748', 
				PredixReference: '/engine/8c12e00a-7d73-42a5-aef3-8f87298d6748',
				Selected: 0
			},
			{
				ID: 13,
				DisplayedName: '99fefd4b-6503-4e9f-81e4-4a35acd336a8', 
				PredixReference: '/engine/99fefd4b-6503-4e9f-81e4-4a35acd336a8',
				Selected: 0
			},
			{
				ID: 14,
				DisplayedName: 'af1135b8-e3a7-4938-967d-4783a8ebafe5', 
				PredixReference: '/engine/af1135b8-e3a7-4938-967d-4783a8ebafe5',
				Selected: 0
			},
			{
				ID: 15,
				DisplayedName: 'cd37ef1b-b0de-494d-877f-32e95b757651', 
				PredixReference: '/engine/cd37ef1b-b0de-494d-877f-32e95b757651',
				Selected: 0
			}
		];
	
	$scope.dataTags = 
		[
			{
				ID: 1,
				DisplayedName: 'Engine Frequency',
				Selected: 0
			},
			{
				ID: 2,
				DisplayedName: 'Engine Hours',
				Selected: 0
			},
			{
				ID: 3,
				DisplayedName: 'Engine LB Exhaust Temp',
				Selected: 0
			},
			{
				ID: 4,
				DisplayedName: 'Engine Load',
				Selected: 0
			},
			{
				ID: 5,
				DisplayedName: 'Engine Oil Pressure',
				Selected: 0
			},
			{
				ID: 6,
				DisplayedName: 'Engine Oil Temp',
				Selected: 0
			},
			{
				ID: 7,
				DisplayedName: 'Engine Power',
				Selected: 0
			},
			{
				ID: 8,
				DisplayedName: 'Engine Power - Insights',
				Selected: 0
			},
			{
				ID: 9,
				DisplayedName: 'Engine RB Exhaust Temp',
				Selected: 0
			},
			{
				ID: 10,
				DisplayedName: 'Engine Speed',
				Selected: 0
			}
		];

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
    		var req = 
    		{
				 method: 'POST',
				 url: '/springmvc-helloworld/getLimitedDataPoints/',
				 headers: {
				   'Content-Type': 'application/json'
				 },
				 data: data
			}
    		
			$http(req)
			.then(
				function(data){
					var dirtyData = data;
				
					console.log(data);
				}, 
				function(data){
					console.log("Could not get the Predix data due to " + data);
				}
			);
        	
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
