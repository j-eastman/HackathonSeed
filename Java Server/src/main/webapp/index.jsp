<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-route.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript" src="sample.js"></script>

<script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>

<link rel="import" href="bower_components/px-dropdown/px-dropdown.html"></link>
<link rel="import"
	href="bower_components/px-dropdown/px-dropdown-content.html"></link>

<link rel="import"
	href="bower_components/px-vis-timeseries/px-vis-timeseries.html">
<link rel="import" href="bower_components/px-dropdown/px-dropdown.html">
</head>

<title>GEHC Hackathon #4</title>
</head>

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<a class="navbar-brand" href="#/">GEHC Hackathon - Java</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#/">Home</a></li>
				<li><a href="#/one">One</a></li>
				<li><a href="#/two">Two</a></li>
				<li><a href="#/three">Three</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#/learn">Learn More</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<body ng-app="predixModule" ng-controller="mainController">
	<div id="container">
		<style>
table {
	
}

px-dropdown {
	position: relative;
	z-index: 5;
	left: 0;
}

i {
	color: brown;
}

button {
	color: black;
}

ul {
	height: 200px;
	overflow: visible;
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.multiselect {
	width: 200px;
}

.selectBox {
	position: relative;
}

.selectBox select {
	width: 100%;
	font-weight: bold;
}

.overSelect {
	position: absolute;
	left: 0;
	right: 0;
	top: 0;
	bottom: 0;
}

#checkboxes {
	display: none;
	border: 1px #dadada solid;
}

#checkboxes label {
	display: block;
}

#checkboxes label:hover {
	background-color: #1e90ff;
}

#checkboxes2 {
	display: none;
	border: 1px #dadada solid;
}

#checkboxes2 label {
	display: block;
}

#checkboxes2 label:hover {
	background-color: #1e90ff;
}
</style>
		</head>
		<body>
			<h1>3Left</h1>
			<table style="width: 100%">
				<tr style="width: 100%" class="multiselect">
					<div class="selectBox" onclick="showCheckboxes()">
								<select>
									<option value="Tags">Tags</option>
								</select>
								<div class="overSelect"></div>
							</div>
							<div id="checkboxes">
								<label ng-repeat="e in engines track by e.ID" for="eng{{e.ID}}">
									<input type="checkbox" id="eng{{e.ID}}" /> {{e.DisplayedName}}
								</label>
							</div>
				</tr>
				<tr class="multiselect">
							<div class="selectBox" onclick="showCheckboxes2()">
								<select>
									<option value="Engines">Engines</option>
								</select>
								<div class="overSelect"></div>
							</div>
							<div id="checkboxes2">
								<label ng-repeat="t in dataTags track by t.ID" for="tag{{t.ID}}">
									<input type="checkbox" id="tag{{t.ID}}" /> {{t.DisplayedName}}
								</label>
							</div>
				</tr>
				<tr>
						<button class="btn">
  						<i class="fa fa-briefcase u-mr--"></i> Apply</button>
				</tr>
				<tr>
					<td style="z-index: -1; position: relative"><px-vis-timeseries
							prevent-resize="true" debounce-resize-timing="250" width="1024"
							height="576" padding-top="400"
							progressive-rendering-points-per-frame="16000"
							progressive-rendering-min-frames="1"
							chart-horizontal-alignment="center"
							chart-vertical-alignment="center"
							margin='{"top":20,"bottom":15,"left":65,"right":65}'
							tooltip-config='{}'
							register-config='{"type":"vertical","width":200}'
							selection-type="xy"
							chart-data={{graphData}}
							series-config='{"y0":{"name":"y0","x":"x","y":"y0","yAxisUnit":"F","axis":{"id":"axis1","side":"left","number":"1"}},"y1":{"name":"y1","x":"x","y":"y1","yAxisUnit":"Hz","axis":{"id":"axis2","side":"right","number":"1"}},"y2":{"name":"y2","x":"x","y":"y2","yMin":0.11,"yMax":1.1,"yAxisUnit":"C","axis":{"id":"axis3","side":"left","number":"2"}},"y3":{"name":"y3","x":"x","y":"y3","yAxisUnit":"F","axis":{"id":"axis4","side":"right","number":"2"}}}'
							chart-extents='{"x":["dynamic","dynamic"],"y":["dynamic","dynamic"]}'
							event-data='[{"id":"123","time":1398714240000,"label":"Recalibrate"},{"id":"456","time":1397640960000,"label":"Fan start"},{"id":"789","time":1398126240000,"label":"Fan stop"},{"id":"333","time":1398956340000,"label":"Default"}]'
							event-config='{"Recalibrate":{"color":"blue","icon":"fa-camera","type":"fa","offset":[0,0],"lineColor":"red","lineWeight":0},"Fan start":{"color":"green","icon":"#","type":"unicode","offset":[1,0]},"Fan stop":{"icon":"ge_logo.png","type":"image","offset":[0,-20],"size":"20"}}'
							threshold-data='[{"for":"y0","type":"max","value":15.4784},{"for":"y0","type":"min","value":7.6531},{"for":"y0","type":"mean","value":15.330657585139331},{"for":"y1","type":"mean","value":75},{"for":"y1","type":"quartile","value":17}]'
							display-threshold-title="true"
							threshold-config='{"max":{"color":"red","dashPattern":"5,0","title":"MAX","showThresholdBox":true,"displayTitle":true}}'
							x-axis-config='{"title":"Date"}'
							y-axis-config='{"title":"Single","titleTruncation":false,"unit":"F","axis1":{"title":"Temperature","titleTruncation":false,"unit":"C"}}'
							dynamic-menu-config='[{"name":"Delete","action":"function(data) {var conf = this.seriesConfig;delete conf[data.additionalDetail.name];this.set(\"seriesConfig\", {}); this.set(\"seriesConfig\", conf);}","eventName":"delete","icon":"fa-trash"},{"name":"Bring To Front","action":"function(data) {this.set(\"serieToRedrawOnTop\", data.additionalDetail.name);}","eventName":"bring-to-front","icon":"fa-arrow-up"}]'
							toolbar-config='{"config":{"advancedZoom":true,"pan":true,"tooltip":true,"logHover":{"buttonGroup":2,"tooltipLabel":"The submenu item of this menu will define custom mouse interaction","icon":"fa-leaf","subConfig":{"customClick":{"icon":"fa-coffee","buttonGroup":3,"tooltipLabel":"define some custom mouse interactions on chart","eventName":"my-custom-click","actionConfig":{"mousedown":"function(mousePos) { console.log(\"custom click on chart. Context is the chart. Mouse pos is available: \" + JSON.stringify(mousePos))}","mouseup":"function(mousePos) { console.log(\"custom action on mouse up the chart \" + JSON.stringify(mousePos));}","mouseout":"function(mousePos) { console.log(\"custom action on mouse out the chart \" + JSON.stringify(mousePos));}","mousemove":"function(mousePos) { console.log(\"custom action on hovering the chart \");}"}},"customClick2":{"buttonGroup":3,"icon":"fa-fire-extinguisher","tooltipLabel":"Remove all custom interactions","actionConfig":{"mousedown":null,"mouseup":null,"mouseout":null,"mousemove":null}}}}}}'
							navigator-config='{"xAxisConfig":{"tickFormat":"%b %d"}}'></px-vis-timeseries>
					</td>
				</tr>
			</table>

			<script>
      var expanded = false;
      function showCheckboxes(){
        var checkboxes = document.getElementById("checkboxes");
        if(!expanded){
          checkboxes.style.display = "block";
          expanded = true;
        }
        else{
          checkboxes.style.display = "none";
          expanded = false;
        }
      }

      var expanded2 = false;
      function showCheckboxes2(){
        var checkboxes2 = document.getElementById("checkboxes2");
        if(!expanded2){
          checkboxes2.style.display = "block";
          expanded2 = true;
        }
        else{
          checkboxes2.style.display = "none";
          expanded2 = false;
        }
      }
    </script>

			<div ng-view></div>
	</div>

</body>
</html>
