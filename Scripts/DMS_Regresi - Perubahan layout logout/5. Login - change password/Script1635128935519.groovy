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

Mobile.delay(2)

MobileElement account = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

account.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_SummaryAcc_icon_button'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-5.1-masuk ke summary account') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_SummaryAcc_Ubahpass_button'), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_Ubahpass_oldpass_text'), FINA_oldpass, 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_Ubahpass_newpass_text'), FINA_newpass, 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_Ubahpass_newpass_confirm_text'), FINA_newpass, 
    0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-5.2-ubah password, simpan') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Change Password/FINA_Ubahpass_Simpan_button'), 0)

