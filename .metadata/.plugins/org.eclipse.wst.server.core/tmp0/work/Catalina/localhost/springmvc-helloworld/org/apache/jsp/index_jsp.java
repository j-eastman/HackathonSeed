/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.13
 * Generated at: 2017-04-08 12:38:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-route.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"sample.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"bower_components/webcomponentsjs/webcomponents-lite.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"import\" href=\"bower_components/px-dropdown/px-dropdown.html\"></link>\n");
      out.write("<link rel=\"import\"\n");
      out.write("\thref=\"bower_components/px-dropdown/px-dropdown-content.html\"></link>\n");
      out.write("\n");
      out.write("<link rel=\"import\"\n");
      out.write("\thref=\"bower_components/px-vis-timeseries/px-vis-timeseries.html\">\n");
      out.write("<link rel=\"import\" href=\"bower_components/px-dropdown/px-dropdown.html\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<title>GEHC Hackathon #4</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#/\">GEHC Hackathon - Java</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li><a href=\"#/\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#/one\">One</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#/two\">Two</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#/three\">Three</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li><a href=\"#/learn\">Learn More</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<body ng-app=\"predixModule\" ng-controller=\"mainController\">\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<style>\n");
      out.write("table {\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("px-dropdown {\n");
      out.write("\tposition: relative;\n");
      out.write("\tz-index: 5;\n");
      out.write("\tleft: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("i {\n");
      out.write("\tcolor: brown;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\theight: 200px;\n");
      out.write("\toverflow: visible;\n");
      out.write("\tlist-style-type: none;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tbackground-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("\tfloat: left;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding: 14px 16px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".multiselect {\n");
      out.write("\twidth: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectBox {\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectBox select {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overSelect {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 0;\n");
      out.write("\tright: 0;\n");
      out.write("\ttop: 0;\n");
      out.write("\tbottom: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tborder: 1px #dadada solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes label {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes label:hover {\n");
      out.write("\tbackground-color: #1e90ff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes2 {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tborder: 1px #dadada solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes2 label {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes2 label:hover {\n");
      out.write("\tbackground-color: #1e90ff;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("\t\t\t<h1>3Left</h1>\n");
      out.write("\t\t\t<table style=\"width: 100%\">\n");
      out.write("\t\t\t\t<tr style=\"width: 100%\" class=\"multiselect\">\n");
      out.write("\t\t\t\t\t<div class=\"selectBox\" onclick=\"showCheckboxes()\">\n");
      out.write("\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Tags\">Tags</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overSelect\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"checkboxes\">\n");
      out.write("\t\t\t\t\t\t\t\t<label ng-repeat=\"e in engines track by e.ID\" for=\"eng{{e.ID}}\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"eng{{e.ID}}\" /> {{e.DisplayedName}}\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr class=\"multiselect\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"selectBox\" onclick=\"showCheckboxes2()\">\n");
      out.write("\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Engines\">Engines</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overSelect\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"checkboxes2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label ng-repeat=\"t in dataTags track by t.ID\" for=\"tag{{t.ID}}\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"tag{{t.ID}}\" /> {{t.DisplayedName}}\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\" ng-click=\"applyFilters()\">\n");
      out.write("  \t\t\t\t\t\t<i class=\"fa fa-briefcase u-mr--\"></i> Apply</button>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<!-- <px-vis-timeseries prevent-resize=\"true\" debounce-resize-timing=\"250\" width=\"700\" height=\"450\" progressive-rendering-points-per-frame=\"16000\" progressive-rendering-min-frames=\"1\" chart-horizontal-alignment=\"center\" chart-vertical-alignment=\"center\" margin='{\"top\":30,\"bottom\":60,\"left\":65,\"right\":65}' tooltip-config='{}' register-config='{\"type\":\"vertical\",\"width\":200}' selection-type=\"xy\" chart-data='[{\"x\":1397102460000,\"y0\":11.4403,\"y1\":96.5,\"y2\":0.56,\"y3\":0.56},{\"x\":1397139660000,\"y0\":13.1913,\"y1\":96.5,\"y2\":0.4,\"y3\":0.4},{\"x\":1397177400000,\"y0\":12.8485,\"y1\":96.5,\"y2\":0.43,\"y3\":0.43},{\"x\":1397228040000,\"y0\":10.975,\"y1\":96.5,\"y2\":0.33,\"y3\":0.33},{\"x\":1397248260000,\"y0\":12.9377,\"y1\":96.5,\"y2\":0.47,\"y3\":0.47},{\"x\":1397291280000,\"y0\":13.3795,\"y1\":96.5,\"y2\":0.41,\"y3\":0.41},{\"x\":1397522940000,\"y0\":16.4446,\"y1\":96.5,\"y2\":0.32,\"y3\":0.32},{\"x\":1397542800000,\"y0\":12.2771,\"y1\":96.5,\"y2\":0.35,\"y3\":0.35},{\"x\":1397640960000,\"y0\":13.0709,\"y1\":96.5,\"y2\":0.34,\"y3\":0.34},{\"x\":1397663100000,\"y1\":88.8,\"y2\":0.28,\"y3\":0.28},{\"x\":1397700000000,\"y0\":12.6198,\"y1\":95.2,\"y2\":0.49,\"y3\":0.49},{\"x\":1397753040000,\"y0\":11.0486,\"y1\":96.5,\"y2\":0.35,\"y3\":0.35},{\"x\":1397772540000,\"y0\":14.6892,\"y1\":96.5,\"y2\":0.21,\"y3\":0.21},{\"x\":1397794860000,\"y0\":14.3738,\"y1\":96.5,\"y2\":0.42,\"y3\":0.42},{\"x\":1397813580000,\"y0\":10.4259,\"y1\":76.5,\"y2\":0.58,\"y3\":0.58},{\"x\":1397890680000,\"y0\":13.4261,\"y1\":96.5,\"y2\":0.37,\"y3\":0.37},{\"x\":1397932020000,\"y0\":13.0062,\"y1\":96.5,\"y2\":0.27,\"y3\":0.27},{\"x\":1397973480000,\"y0\":14.475,\"y1\":96.5,\"y2\":0.35,\"y3\":0.35},{\"x\":1398009240000,\"y1\":96.5,\"y2\":0.24,\"y3\":0.24},{\"x\":1398035760000,\"y0\":15.9555,\"y1\":96.5},{\"x\":1398075840000,\"y0\":14.535,\"y1\":16},{\"x\":1398102960000,\"y0\":12.3671,\"y1\":96.5},{\"x\":1398126240000,\"y0\":12.4245,\"y1\":96.5},{\"x\":1398195060000,\"y0\":12.0836,\"y1\":96.5,\"y2\":0.31,\"y3\":0.31},{\"x\":1398219120000,\"y0\":15.3137,\"y1\":96.5,\"y2\":0.34,\"y3\":0.34},{\"x\":1398239220000,\"y0\":13.7978,\"y1\":96.5,\"y2\":0.32,\"y3\":0.32},{\"x\":1398617940000,\"y1\":55.4,\"y2\":0.16,\"y3\":0.16},{\"x\":1398638520000,\"y0\":15.0664,\"y1\":85.7,\"y2\":0.41,\"y3\":0.41},{\"x\":1398691860000,\"y0\":13.504,\"y1\":96.5,\"y2\":0.31,\"y3\":0.31},{\"x\":1398714240000,\"y0\":13.7263,\"y1\":96.5,\"y2\":0.36,\"y3\":0.36},{\"x\":1398807540000,\"y0\":14.57,\"y1\":96.5,\"y2\":0.44,\"y3\":0.44},{\"x\":1398858180000,\"y0\":13.9641,\"y1\":96.5,\"y2\":0.25,\"y3\":0.25},{\"x\":1398879420000,\"y0\":12.5418,\"y1\":96.5,\"y2\":0.42,\"y3\":0.42},{\"x\":1398920880000,\"y0\":14.8822,\"y1\":96.5,\"y2\":0.22,\"y3\":0.22},{\"x\":1398956340000,\"y0\":15.2676,\"y1\":96.5,\"y2\":0.42,\"y3\":0.42},{\"x\":1398995280000,\"y1\":20.3,\"y2\":0.16,\"y3\":0.16}]' series-config='{\"y0\":{\"name\":\"y0\",\"x\":\"x\",\"y\":\"y0\",\"yAxisUnit\":\"F\",\"axis\":{\"id\":\"axis1\",\"side\":\"left\",\"number\":\"1\"}},\"y1\":{\"name\":\"y1\",\"x\":\"x\",\"y\":\"y1\",\"yAxisUnit\":\"Hz\",\"axis\":{\"id\":\"axis2\",\"side\":\"right\",\"number\":\"1\"}},\"y2\":{\"name\":\"y2\",\"x\":\"x\",\"y\":\"y2\",\"yMin\":0.11,\"yMax\":1.1,\"yAxisUnit\":\"C\",\"axis\":{\"id\":\"axis3\",\"side\":\"left\",\"number\":\"2\"}},\"y3\":{\"name\":\"y3\",\"x\":\"x\",\"y\":\"y3\",\"yAxisUnit\":\"F\",\"axis\":{\"id\":\"axis4\",\"side\":\"right\",\"number\":\"2\"}}}' chart-extents='{\"x\":[\"dynamic\",\"dynamic\"],\"y\":[\"dynamic\",\"dynamic\"]}' event-data='[{\"id\":\"123\",\"time\":1398714240000,\"label\":\"Recalibrate\"},{\"id\":\"456\",\"time\":1397640960000,\"label\":\"Fan start\"},{\"id\":\"789\",\"time\":1398126240000,\"label\":\"Fan stop\"},{\"id\":\"333\",\"time\":1398956340000,\"label\":\"Default\"}]' event-config='{\"Recalibrate\":{\"color\":\"blue\",\"icon\":\"fa-camera\",\"type\":\"fa\",\"offset\":[0,0],\"lineColor\":\"red\",\"lineWeight\":0},\"Fan start\":{\"color\":\"green\",\"icon\":\"ï\",\"type\":\"unicode\",\"offset\":[1,0]},\"Fan stop\":{\"icon\":\"ge_logo.png\",\"type\":\"image\",\"offset\":[0,-20],\"size\":\"20\"}}' threshold-data='[{\"for\":\"y0\",\"type\":\"max\",\"value\":15.4784},{\"for\":\"y0\",\"type\":\"min\",\"value\":7.6531},{\"for\":\"y0\",\"type\":\"mean\",\"value\":15.330657585139331},{\"for\":\"y1\",\"type\":\"mean\",\"value\":75},{\"for\":\"y1\",\"type\":\"quartile\",\"value\":17}]' display-threshold-title=\"true\" threshold-config='{\"max\":{\"color\":\"red\",\"dashPattern\":\"5,0\",\"title\":\"MAX\",\"showThresholdBox\":true,\"displayTitle\":true}}' x-axis-config='{\"title\":\"Date\"}' y-axis-config='{\"title\":\"Single\",\"titleTruncation\":false,\"unit\":\"F\",\"axis1\":{\"title\":\"Temperature\",\"titleTruncation\":false,\"unit\":\"C\"}}' dynamic-menu-config='[{\"name\":\"Delete\",\"action\":\"function(data) {var conf = this.seriesConfig;delete conf[data.additionalDetail.name];this.set(\\\"seriesConfig\\\", {}); this.set(\\\"seriesConfig\\\", conf);}\",\"eventName\":\"delete\",\"icon\":\"fa-trash\"},{\"name\":\"Bring To Front\",\"action\":\"function(data) {this.set(\\\"serieToRedrawOnTop\\\", data.additionalDetail.name);}\",\"eventName\":\"bring-to-front\",\"icon\":\"fa-arrow-up\"}]' toolbar-config='{\"config\":{\"advancedZoom\":true,\"pan\":true,\"tooltip\":true,\"logHover\":{\"buttonGroup\":2,\"tooltipLabel\":\"The submenu item of this menu will define custom mouse interaction\",\"icon\":\"fa-leaf\",\"subConfig\":{\"customClick\":{\"icon\":\"fa-coffee\",\"buttonGroup\":3,\"tooltipLabel\":\"define some custom mouse interactions on chart\",\"eventName\":\"my-custom-click\",\"actionConfig\":{\"mousedown\":\"function(mousePos) { console.log(\\\"custom click on chart. Context is the chart. Mouse pos is available: \\\" + JSON.stringify(mousePos))}\",\"mouseup\":\"function(mousePos) { console.log(\\\"custom action on mouse up the chart \\\" + JSON.stringify(mousePos));}\",\"mouseout\":\"function(mousePos) { console.log(\\\"custom action on mouse out the chart \\\" + JSON.stringify(mousePos));}\",\"mousemove\":\"function(mousePos) { console.log(\\\"custom action on hovering the chart \\\");}\"}},\"customClick2\":{\"buttonGroup\":3,\"icon\":\"fa-fire-extinguisher\",\"tooltipLabel\":\"Remove all custom interactions\",\"actionConfig\":{\"mousedown\":null,\"mouseup\":null,\"mouseout\":null,\"mousemove\":null}}}}}}' navigator-config='{\"xAxisConfig\":{\"tickFormat\":\"%b %d\"}}'></px-vis-timeseries> -->\n");
      out.write("\t\t\t\t\t<td style=\"z-index: -1; position: relative\"><px-vis-timeseries\n");
      out.write("\t\t\t\t\t\t\tprevent-resize=\"true\" debounce-resize-timing=\"250\" width=\"1024\"\n");
      out.write("\t\t\t\t\t\t\theight=\"576\" padding-top=\"400\"\n");
      out.write("\t\t\t\t\t\t\tprogressive-rendering-points-per-frame=\"16000\"\n");
      out.write("\t\t\t\t\t\t\tprogressive-rendering-min-frames=\"1\"\n");
      out.write("\t\t\t\t\t\t\tchart-horizontal-alignment=\"center\"\n");
      out.write("\t\t\t\t\t\t\tchart-vertical-alignment=\"center\"\n");
      out.write("\t\t\t\t\t\t\tmargin='{\"top\":20,\"bottom\":15,\"left\":65,\"right\":65}'\n");
      out.write("\t\t\t\t\t\t\ttooltip-config='{}'\n");
      out.write("\t\t\t\t\t\t\tregister-config='{\"type\":\"vertical\",\"width\":200}'\n");
      out.write("\t\t\t\t\t\t\tselection-type=\"xy\"\n");
      out.write("\t\t\t\t\t\t\tchart-data={{graphData}}\n");
      out.write("\t\t\t\t\t\t\tseries-config='{\"y0\":{\"name\":\"y0\",\"x\":\"x\",\"y\":\"y0\",\"yAxisUnit\":\"F\",\"axis\":{\"id\":\"axis1\",\"side\":\"left\",\"number\":\"1\"}},\"y1\":{\"name\":\"y1\",\"x\":\"x\",\"y\":\"y1\",\"yAxisUnit\":\"Hz\",\"axis\":{\"id\":\"axis2\",\"side\":\"right\",\"number\":\"1\"}},\"y2\":{\"name\":\"y2\",\"x\":\"x\",\"y\":\"y2\",\"yMin\":0.11,\"yMax\":1.1,\"yAxisUnit\":\"C\",\"axis\":{\"id\":\"axis3\",\"side\":\"left\",\"number\":\"2\"}},\"y3\":{\"name\":\"y3\",\"x\":\"x\",\"y\":\"y3\",\"yAxisUnit\":\"F\",\"axis\":{\"id\":\"axis4\",\"side\":\"right\",\"number\":\"2\"}}}'\n");
      out.write("\t\t\t\t\t\t\tchart-extents='{\"x\":[\"dynamic\",\"dynamic\"],\"y\":[\"dynamic\",\"dynamic\"]}'\n");
      out.write("\t\t\t\t\t\t\tevent-data='[{\"id\":\"123\",\"time\":1398714240000,\"label\":\"Recalibrate\"},{\"id\":\"456\",\"time\":1397640960000,\"label\":\"Fan start\"},{\"id\":\"789\",\"time\":1398126240000,\"label\":\"Fan stop\"},{\"id\":\"333\",\"time\":1398956340000,\"label\":\"Default\"}]'\n");
      out.write("\t\t\t\t\t\t\tevent-config='{\"Recalibrate\":{\"color\":\"blue\",\"icon\":\"fa-camera\",\"type\":\"fa\",\"offset\":[0,0],\"lineColor\":\"red\",\"lineWeight\":0},\"Fan start\":{\"color\":\"green\",\"icon\":\"#\",\"type\":\"unicode\",\"offset\":[1,0]},\"Fan stop\":{\"icon\":\"ge_logo.png\",\"type\":\"image\",\"offset\":[0,-20],\"size\":\"20\"}}'\n");
      out.write("\t\t\t\t\t\t\tthreshold-data='[{\"for\":\"y0\",\"type\":\"max\",\"value\":15.4784},{\"for\":\"y0\",\"type\":\"min\",\"value\":7.6531},{\"for\":\"y0\",\"type\":\"mean\",\"value\":15.330657585139331},{\"for\":\"y1\",\"type\":\"mean\",\"value\":75},{\"for\":\"y1\",\"type\":\"quartile\",\"value\":17}]'\n");
      out.write("\t\t\t\t\t\t\tdisplay-threshold-title=\"true\"\n");
      out.write("\t\t\t\t\t\t\tthreshold-config='{\"max\":{\"color\":\"red\",\"dashPattern\":\"5,0\",\"title\":\"MAX\",\"showThresholdBox\":true,\"displayTitle\":true}}'\n");
      out.write("\t\t\t\t\t\t\tx-axis-config='{\"title\":\"Date\"}'\n");
      out.write("\t\t\t\t\t\t\ty-axis-config='{\"title\":\"Single\",\"titleTruncation\":false,\"unit\":\"F\",\"axis1\":{\"title\":\"Temperature\",\"titleTruncation\":false,\"unit\":\"C\"}}'\n");
      out.write("\t\t\t\t\t\t\tdynamic-menu-config='[{\"name\":\"Delete\",\"action\":\"function(data) {var conf = this.seriesConfig;delete conf[data.additionalDetail.name];this.set(\\\"seriesConfig\\\", {}); this.set(\\\"seriesConfig\\\", conf);}\",\"eventName\":\"delete\",\"icon\":\"fa-trash\"},{\"name\":\"Bring To Front\",\"action\":\"function(data) {this.set(\\\"serieToRedrawOnTop\\\", data.additionalDetail.name);}\",\"eventName\":\"bring-to-front\",\"icon\":\"fa-arrow-up\"}]'\n");
      out.write("\t\t\t\t\t\t\ttoolbar-config='{\"config\":{\"advancedZoom\":true,\"pan\":true,\"tooltip\":true,\"logHover\":{\"buttonGroup\":2,\"tooltipLabel\":\"The submenu item of this menu will define custom mouse interaction\",\"icon\":\"fa-leaf\",\"subConfig\":{\"customClick\":{\"icon\":\"fa-coffee\",\"buttonGroup\":3,\"tooltipLabel\":\"define some custom mouse interactions on chart\",\"eventName\":\"my-custom-click\",\"actionConfig\":{\"mousedown\":\"function(mousePos) { console.log(\\\"custom click on chart. Context is the chart. Mouse pos is available: \\\" + JSON.stringify(mousePos))}\",\"mouseup\":\"function(mousePos) { console.log(\\\"custom action on mouse up the chart \\\" + JSON.stringify(mousePos));}\",\"mouseout\":\"function(mousePos) { console.log(\\\"custom action on mouse out the chart \\\" + JSON.stringify(mousePos));}\",\"mousemove\":\"function(mousePos) { console.log(\\\"custom action on hovering the chart \\\");}\"}},\"customClick2\":{\"buttonGroup\":3,\"icon\":\"fa-fire-extinguisher\",\"tooltipLabel\":\"Remove all custom interactions\",\"actionConfig\":{\"mousedown\":null,\"mouseup\":null,\"mouseout\":null,\"mousemove\":null}}}}}}'\n");
      out.write("\t\t\t\t\t\t\tnavigator-config='{\"xAxisConfig\":{\"tickFormat\":\"%b %d\"}}'></px-vis-timeseries>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t<script>\n");
      out.write("      var expanded = false;\n");
      out.write("      function showCheckboxes(){\n");
      out.write("        var checkboxes = document.getElementById(\"checkboxes\");\n");
      out.write("        if(!expanded){\n");
      out.write("          checkboxes.style.display = \"block\";\n");
      out.write("          expanded = true;\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("          checkboxes.style.display = \"none\";\n");
      out.write("          expanded = false;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      var expanded2 = false;\n");
      out.write("      function showCheckboxes2(){\n");
      out.write("        var checkboxes2 = document.getElementById(\"checkboxes2\");\n");
      out.write("        if(!expanded2){\n");
      out.write("          checkboxes2.style.display = \"block\";\n");
      out.write("          expanded2 = true;\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("          checkboxes2.style.display = \"none\";\n");
      out.write("          expanded2 = false;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\t\t\t<div ng-view></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
