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
formatter.scenarioOutline({
  "line": 4,
  "name": "Move letter from SentLettersPage to TrashLettersPage",
  "description": "",
  "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user login to url, with \"\u003cusername\u003e\", and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user move first sent letter to Trash",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user open Trash Page and check letter have been moved",
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
  "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;;1"
    },
    {
      "cells": [
        "sergeishatilov",
        "epamsystems"
      ],
      "line": 11,
      "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;;2"
    },
    {
      "cells": [
        "sergei.shatilov",
        "epamsystems"
      ],
      "line": 12,
      "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14290790287,
  "status": "passed"
});
formatter.before({
  "duration": 2328211,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Move letter from SentLettersPage to TrashLettersPage",
  "description": "",
  "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@move_letter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user login to url, with \"sergeishatilov\", and \"epamsystems\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user move first sent letter to Trash",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user open Trash Page and check letter have been moved",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "sergeishatilov",
      "offset": 25
    },
    {
      "val": "epamsystems",
      "offset": 47
    }
  ],
  "location": "MoveLetterStepdefs.userLoginToUrlWithAnd(String,String)"
});
formatter.result({
  "duration": 12358089578,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userMoveFirstSentLetterToTrash()"
});
formatter.result({
  "duration": 1257646023,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userOpenTrashPageAndCheckLetterHaveBeenMoved()"
});
formatter.result({
  "duration": 1739097519,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userLogout()"
});
formatter.result({
  "duration": 3438294408,
  "status": "passed"
});
formatter.before({
  "duration": 30791,
  "status": "passed"
});
formatter.before({
  "duration": 21349,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Move letter from SentLettersPage to TrashLettersPage",
  "description": "",
  "id": "move-letter;move-letter-from-sentletterspage-to-trashletterspage;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@move_letter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user login to url, with \"sergei.shatilov\", and \"epamsystems\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user move first sent letter to Trash",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user open Trash Page and check letter have been moved",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "sergei.shatilov",
      "offset": 25
    },
    {
      "val": "epamsystems",
      "offset": 48
    }
  ],
  "location": "MoveLetterStepdefs.userLoginToUrlWithAnd(String,String)"
});
formatter.result({
  "duration": 5636600410,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userMoveFirstSentLetterToTrash()"
});
formatter.result({
  "duration": 1010002151,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userOpenTrashPageAndCheckLetterHaveBeenMoved()"
});
formatter.result({
  "duration": 1715895878,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userLogout()"
});
formatter.result({
  "duration": 2445074998,
  "status": "passed"
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
  "name": "user login to url, with \"\u003cusername\u003e\", and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user send letter to \"sergeishatilov@rambler.ru\"",
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
        "epamsystems"
      ],
      "line": 12,
      "id": "write-letter;write-letter-in-rambler-mail;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 38591,
  "status": "passed"
});
formatter.before({
  "duration": 41876,
  "status": "passed"
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
  "name": "user login to url, with \"sergeishatilov\", and \"epamsystems\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user send letter to \"sergeishatilov@rambler.ru\"",
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
formatter.match({
  "arguments": [
    {
      "val": "sergeishatilov",
      "offset": 25
    },
    {
      "val": "epamsystems",
      "offset": 47
    }
  ],
  "location": "MoveLetterStepdefs.userLoginToUrlWithAnd(String,String)"
});
formatter.result({
  "duration": 4465566620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sergeishatilov@rambler.ru",
      "offset": 21
    }
  ],
  "location": "WriteLetterStepdefs.userSendLetterTo(String)"
});
formatter.result({
  "duration": 4834020041,
  "status": "passed"
});
formatter.match({
  "location": "WriteLetterStepdefs.letter_should_have_been_sent()"
});
formatter.result({
  "duration": 1867845811,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userLogout()"
});
formatter.result({
  "duration": 2266757288,
  "status": "passed"
});
formatter.before({
  "duration": 28327,
  "status": "passed"
});
formatter.before({
  "duration": 20117,
  "status": "passed"
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
  "name": "user login to url, with \"sergei.shatilov\", and \"epamsystems\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user send letter to \"sergeishatilov@rambler.ru\"",
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
formatter.match({
  "arguments": [
    {
      "val": "sergei.shatilov",
      "offset": 25
    },
    {
      "val": "epamsystems",
      "offset": 48
    }
  ],
  "location": "MoveLetterStepdefs.userLoginToUrlWithAnd(String,String)"
});
formatter.result({
  "duration": 4728259496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sergeishatilov@rambler.ru",
      "offset": 21
    }
  ],
  "location": "WriteLetterStepdefs.userSendLetterTo(String)"
});
formatter.result({
  "duration": 3724789964,
  "status": "passed"
});
formatter.match({
  "location": "WriteLetterStepdefs.letter_should_have_been_sent()"
});
formatter.result({
  "duration": 1307794723,
  "status": "passed"
});
formatter.match({
  "location": "MoveLetterStepdefs.userLogout()"
});
formatter.result({
  "duration": 2815494528,
  "status": "passed"
});
});