<html>
	<head>
		 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
   		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
   		 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    	 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-route.js"></script>

 	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	    
	    <script type="text/javascript" src="sample.js"></script>
	    
    	<script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
    	
	    <!--Iron-->
	    <link rel="import" href="bower_components/iron-ajax/iron-ajax.html">
	</head>

  <title>GEHC Hackathon #1</title>
</head>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#/">GEHC Hackathon - Java</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="#/">Home</a></li>
                <li><a href="#/one">One</a></li>
                <li><a href="#/two">Two</a></li>
                <li><a href="#/three">Three</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#/learn">Learn More</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<body ng-app="predixModule" ng-controller="mainController">

	<div id="container">

<button ng-click="aggregateData()"></button>

<iron-ajax
    auto
    url="https://time-series-store-predix.run.aws-usw02-pr.ice.predix.io/v1/datapoints"
    headers="Authorization: Bearer {{token}}
   		Predix-Zone-Id: e3fba85e-d334-409e-87ce-3a17e71b4946
   		Origin: http://localhost/"
   	body={
	  "tags": [
	    {
	      "name": "Engine Battery Voltage",
	      "order": "desc",
	      "aggregations": [
	        {
	          "type": "avg",
	          "sampling": {
	            "unit": "s",
	            "value": "30"
	          }
	        }
	      ]
	    }
	  ],
	  "start": 1491523200000,
	  "end": 1491591600000
	}
    handle-as="json"
    last-response="{{response}}"
    debounce-duration="300"></iron-ajax>
    
    <h1>{{response}}</h1>
	    <div ng-view></div>

	</div>

</body>
</html>