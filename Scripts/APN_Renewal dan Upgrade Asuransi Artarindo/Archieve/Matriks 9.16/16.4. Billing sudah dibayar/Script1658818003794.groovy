import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import io.appium.java_client.MobileElement as MobileElement

'Get directory project'
String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8)

Mobile.pressBack()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Billing_Button'), 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-16.16-list billing belum dibayar') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Billing/FINA_Billing_Sudah Dibayar'), 0)

Mobile.delay(2)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-16.17-list billing sudah dibayar') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

MobileElement Account = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

Account.click()

Mobile.delay(10)

