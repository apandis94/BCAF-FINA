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

MobileElement element = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

element.click()

Mobile.delay(1)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-4.1-my account') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Tracking/FINA_Acc_Tracking Pengajuan_button'), 0)

Mobile.delay(5)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-4.2-tracking pengajuan konsumen') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Tracking/FINA_Account_Tracking_Listapp1_Button'), 0)

Mobile.delay(20)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-4.3-detail pengajuan konsumen') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Tracking/FINA_Account_Tracking_Detail_Back_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Tracking/FINA_Account_Tracking_Back_Button'), 0)

MobileElement Home = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_BottomNav_Home_Button'), 
    10)

Home.click()

