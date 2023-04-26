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

'start'

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

Mobile.comment('end')

WebUI.delay(2)

MobileElement element = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

element.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_SummaryAccount_Button'), 0)

'before'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-4.1-1 data sebelum') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_SummaryAccount_Edit Akun_Button'), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/Edit_Konsumen_Nama Lengkap_Text'), 'Sanusi', 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Norek_Text'), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Norek_Text'), '1234567890', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Alamat_Text'), 'Jl. Metro Pondok Indah no.1', 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_KodePos_Text'), '12310', 
    0)

'halaman edit profile I'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-4.1-2 tampilan edit profile') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Kota_Text'), 'Jakarta Selatan', 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Provinsi_Text'), 'DKI Jakarta', 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Notlp1_Text'), '089534703110', 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/FINA_Account_Summary_EditAkun_Notlp2_Text'), '087877710010', 
    0)

'halaman edit profile II\r\n'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-4.1-3 tampilan edit profile') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/Edit/Konsumen/Edit_Konsumen_Simpan_Button'), 0)

Mobile.delay(2)

'after'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-4.1-4 data sesudah') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_Summary_Back_Button'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Account/FINA_Account_Konsumen_Logout_Button'), 0)

