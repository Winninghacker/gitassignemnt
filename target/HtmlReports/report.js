$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "feature to test google search functionality",
  "description": "",
  "id": "feature-to-test-google-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate google search is working",
  "description": "",
  "id": "feature-to-test-google-search-functionality;validate-google-search-is-working",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter text in search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "hits enter",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to search page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "duration": 2133384700,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 102\nCurrent browser version is 108.0.5359.71 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN-B7KRXM3\u0027, ip: \u0027192.168.203.205\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00C7D953+2414931]\n\tOrdinal0 [0x00C0F5E1+1963489]\n\tOrdinal0 [0x00AFC6B8+837304]\n\tOrdinal0 [0x00B1CAE3+969443]\n\tOrdinal0 [0x00B186FA+952058]\n\tOrdinal0 [0x00B15FB1+942001]\n\tOrdinal0 [0x00B49100+1151232]\n\tOrdinal0 [0x00B48D5A+1150298]\n\tOrdinal0 [0x00B442B6+1131190]\n\tOrdinal0 [0x00B1E860+976992]\n\tOrdinal0 [0x00B1F756+980822]\n\tGetHandleVerifier [0x00EECC62+2510274]\n\tGetHandleVerifier [0x00EDF760+2455744]\n\tGetHandleVerifier [0x00D0EABA+551962]\n\tGetHandleVerifier [0x00D0D916+547446]\n\tOrdinal0 [0x00C15F3B+1990459]\n\tOrdinal0 [0x00C1A898+2009240]\n\tOrdinal0 [0x00C1A985+2009477]\n\tOrdinal0 [0x00C23AD1+2046673]\n\tBaseThreadInitThunk [0x76686939+25]\n\tRtlGetFullPathName_UEx [0x77B18FD2+1218]\n\tRtlGetFullPathName_UEx [0x77B18F9D+1165]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepdefination.GoogleSearchSteps.browser_is_open(GoogleSearchSteps.java:23)\r\n\tat ✽.Given browser is open(src/test/java/feature/GoogleSearch.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_google_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.user_enter_text_in_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.hits_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_navigated_to_search_page()"
});
formatter.result({
  "status": "skipped"
});
});