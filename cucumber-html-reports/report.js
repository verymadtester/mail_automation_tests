$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Move_letter.feature");
formatter.feature({
  "line": 2,
  "name": "Move letter",
  "description": "",
  "id": "move-letter",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@move_letter"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Move letter from SentLettersPage to TrashLettersPage",
  "description": "",
  "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user login to \u0027url\u0027, with \u0027username\u0027, and \u0027password\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user open \u0027SentLettersPage\u0027 , move first letter to \u0027TrashLettersPage\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user open \u0027TrashLettersPage\u0027 and check letter",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Write_letter.feature");
formatter.feature({
  "line": 2,
  "name": "Write letter",
  "description": "",
  "id": "write-letter",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@write_letter"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Write letter in rambler mail",
  "description": "",
  "id": "write-letter;write-letter-in-rambler-mail",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user login to \u0027url\u0027, with \u0027\u003cusername\u003e\u0027, and \u0027\u003cpassword\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user press \u0027writeButton\u0027 button, fill \u0027getter\u0027, fill \u0027subject\u0027, and \u0027letterBody\u0027, press \u0027pressSend\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "letter should have been sent",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "write-letter;write-letter-in-rambler-mail;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "write-letter;write-letter-in-rambler-mail;;1"
    },
    {
      "cells": [
        "sergeishatilov",
        "epamsystems"
      ],
      "line": 11,
      "id": "write-letter;write-letter-in-rambler-mail;;2"
    },
    {
      "cells": [
        "sergei.shatilov",
        "epamsystems!"
      ],
      "line": 12,
      "id": "write-letter;write-letter-in-rambler-mail;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Write letter in rambler mail",
  "description": "",
  "id": "write-letter;write-letter-in-rambler-mail;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@write_letter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user login to \u0027url\u0027, with \u0027sergeishatilov\u0027, and \u0027epamsystems\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user press \u0027writeButton\u0027 button, fill \u0027getter\u0027, fill \u0027subject\u0027, and \u0027letterBody\u0027, press \u0027pressSend\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "letter should have been sent",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Write letter in rambler mail",
  "description": "",
  "id": "write-letter;write-letter-in-rambler-mail;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@write_letter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user login to \u0027url\u0027, with \u0027sergei.shatilov\u0027, and \u0027epamsystems!\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user press \u0027writeButton\u0027 button, fill \u0027getter\u0027, fill \u0027subject\u0027, and \u0027letterBody\u0027, press \u0027pressSend\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "letter should have been sent",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});