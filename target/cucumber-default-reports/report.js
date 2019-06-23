$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "  I want to use this to add an Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add Employee",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add employee Labels Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.step({
  "name": "I see following labels",
  "rows": [
    {
      "cells": [
        "First Name"
      ]
    },
    {
      "cells": [
        "Last Name"
      ]
    },
    {
      "cells": [
        "Employee Id"
      ]
    },
    {
      "cells": [
        "Location*"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_following_labels(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});