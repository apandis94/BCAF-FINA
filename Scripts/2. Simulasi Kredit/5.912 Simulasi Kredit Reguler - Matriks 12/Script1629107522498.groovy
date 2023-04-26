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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_Menu_SimulasiApplyKredit_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/FINA_SimulasiApplyKredit_Reguler_Button'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/Simulasi_Reguler_Used Car_Button'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_Tahun Kendaraan_Text'), 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_Tahun Kendaraan_Text'), 
    '2020', 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_OTR_Text'), 
    40)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_OTR_Text'), 
    findTestData('Matriks').getObjectValue('OTR', 12), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_DP_Persen_Text'), 
    40)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_DP_Persen_Text'), 
    findTestData('Matriks').getObjectValue('DP Persen', 12), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_Asuransi_Dropdown'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_Asuransi_Combine_Dropdownval'), 
    0)

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

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.comment('end')

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Reguler_Used_WIlayah_Dropdown'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/Used Car/SimulasiKredit_Used_Wilayah_Lain-lain_Dropdownval'), 
    0)

'Inputan Simulasi Matriks 10\r\n'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-5.12-1-input') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/New Car/Simulasi_Reguler_Calculate_Button'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Hasil Simulasi Matriks 10'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sprint3sspathMobile) + 'skenario-5.12-2-hasil') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Hasil Simulasi/HasilSimulasi_Back_button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Form Simulasi/FormSimulasi_Back_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/JenisSimulasi_Back_Button'), 0)