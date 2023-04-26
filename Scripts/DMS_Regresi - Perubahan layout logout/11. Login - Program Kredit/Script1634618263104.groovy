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

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.1-input username dan password') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

'set user login'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Login/FINA_Login_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Suku Bunga', FailureHandling.STOP_ON_FAILURE)

MobileElement elementAccount = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

elementAccount.click()

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.2-berhasil login') + '.png', FailureHandling.STOP_ON_FAILURE)

MobileElement elementHome = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Home_Button'), 
    10)

elementHome.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_MainMenu_Program_Kredit_Button'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.3-masuk homepage VM') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_VM/FINA_VM_BurgerMenu_Button'), 0)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.4-pilih partner kami') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_VM/FINA_VM_BurgerM_PartnerKami_Button'), 0)

Mobile.delay(3)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.5-pilih merk mobil') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_VM/FINA_VM_Partner_Mitsubishi_Button'), 0)

Mobile.delay(3)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.6-pilih model mobil') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_VM/FINA_VM_Partner_SUV_Button'), 0)

Mobile.delay(2)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathregresi) + 'skenario-11.7-list mobil') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

MobileElement Account = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_BottomNav_Account_Button'),
	10)

Account.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_Logout_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_Logout_OK_button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
