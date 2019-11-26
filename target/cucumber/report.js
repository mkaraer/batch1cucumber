$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/datatablesSO.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing new employee",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see create new entry Box",
  "keyword": "Then "
});
formatter.step({
  "name": "user should enter firstName \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter lastName \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter Position \"\u003cPosition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter office \"\u003coffice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter Extension \"\u003cExtension\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter startDate \"\u003cstartDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter salary \"\u003csalary\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the create button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters first name \"\u003cfirstName\u003e\"to serach box",
  "keyword": "And "
});
formatter.step({
  "name": "user should see first name \"\u003cfirstName\u003e\"is inserted in the table",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for datatables",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "Position",
        "office",
        "Extension",
        "startDate",
        "salary"
      ]
    },
    {
      "cells": [
        "john",
        "doe",
        "retired",
        "london",
        "314",
        "2019-08-02",
        "100000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing new employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Datatables_Steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class steps.Datatables_Steps\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:46)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:32)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\t... 31 more\r\nCaused by: org.openqa.selenium.WebDriverException: Timed out waiting for driver server to start.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-PU869TE1\u0027, ip: \u0027192.168.1.145\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: Driver\r\n\tat org.openqa.selenium.remote.service.DriverService.waitUntilAvailable(DriverService.java:202)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:188)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:79)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat utilities.Driver.getDriver(Driver.java:21)\r\n\tat pages.DatatablePage.\u003cinit\u003e(DatatablePage.java:12)\r\n\tat steps.Datatables_Steps.\u003cinit\u003e(Datatables_Steps.java:11)\r\n\t... 36 more\r\nCaused by: org.openqa.selenium.net.UrlChecker$TimeoutException: Timed out waiting for [http://localhost:3279/status] to be available after 20008 ms\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:100)\r\n\tat org.openqa.selenium.remote.service.DriverService.waitUntilAvailable(DriverService.java:197)\r\n\t... 47 more\r\nCaused by: java.util.concurrent.TimeoutException\r\n\tat java.util.concurrent.FutureTask.get(FutureTask.java:205)\r\n\tat com.google.common.util.concurrent.SimpleTimeLimiter.callWithTimeout(SimpleTimeLimiter.java:156)\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:75)\r\n\t... 48 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_clicks_to_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see create new entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_Steps.user_should_see_create_new_entry_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter firstName \"john\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_firstName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter lastName \"doe\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_lastName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter Position \"retired\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_Position(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter office \"london\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_office(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter Extension \"314\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_Extension(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter startDate \"2019-08-02\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_startDate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter salary \"100000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_should_enter_salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click the create button",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_Steps.user_should_click_the_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters first name \"john\"to serach box",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_Steps.user_enters_first_name_to_serach_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see first name \"john\"is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_Steps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "skipped"
});
});