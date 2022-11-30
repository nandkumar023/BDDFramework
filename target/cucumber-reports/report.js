$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 3,
  "name": "Login Functinality",
  "description": "",
  "id": "login-functinality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 3734528568,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": ": launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user should be launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "background.userShouldBeLaunchTheBrowser()"
});
formatter.result({
  "duration": 72939471,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Facebook username Functionality",
  "description": "",
  "id": "login-functinality;facebook-username-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.userIsOnLoginPage()"
});
formatter.result({
  "duration": 5082375251,
  "status": "passed"
});
formatter.after({
  "duration": 129903637,
  "status": "passed"
});
formatter.before({
  "duration": 2962979150,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": ": launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user should be launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "background.userShouldBeLaunchTheBrowser()"
});
formatter.result({
  "duration": 43700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate password Functionality",
  "description": "",
  "id": "login-functinality;validate-password-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is on password page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.Userisonpasswordpage()"
});
formatter.result({
  "duration": 5081739091,
  "status": "passed"
});
formatter.after({
  "duration": 71412358,
  "status": "passed"
});
});