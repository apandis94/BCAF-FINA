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

WebUI.delay(2)

MobileElement element = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

element.click()

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Login/Login_Text'), FINA_username_Konsumen, 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Login/Login_Password_Text'), FINA_password_Konsumen, 0)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-10.1-input username dan password') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

'set user login'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Login/FINA_Login_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Suku Bunga', FailureHandling.STOP_ON_FAILURE)

MobileElement elementAccount = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

elementAccount.click()

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-10.2-berhasil login') + '.png', FailureHandling.STOP_ON_FAILURE)

MobileElement elementHome = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Home_Button'), 
    10)

elementHome.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_Menu_More_Button'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-10.3-tap menu more') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/Partner Kami/FINA_More_Partner_Dropdown'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/Partner Kami/FINA_More_Partner_PerawatanMbl_Button'), 0)

Mobile.delay(3)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-10.4-tap menu link ke garasi.id') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_VM/FINA_Garasi_ServisMobil_Button'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-10.5-tap service mobil') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()


MobileElement Account = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_BottomNav_Account_Button'),
	10)

Account.click()

'start'

'Get Device Height and Store in device_height variable'
device_Height2 = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width2 = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX2 = device_Width2 / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX2 = startX2

'Storing the startY value'
int startY2 = device_Height2 * 0.30

'Storing the endY value'
int endY2 = device_Height2 * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX2, endY2, endX2, startY2)

Mobile.comment('end')

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_Konsumen_Logout_Button'), 0)
