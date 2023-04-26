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

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Hasil Simulasi/FINA_HasilSimulasi_Apply1th_Button'), 
    0)

Mobile.delay(1)

'SS Apply tenor 1 thn'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-13.5-apply tenor 1 thn') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Hasil Simulasi/FINA_RincianSimulasi_Ajukan_Button'), 
    0)

'Upload KTP Konsumen\r\n'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/FINA_Apply_Upload_KTP_Button'), 
    0)

MobileElement galeri = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/FINA_Apply_Upload_Galeri_Button'), 
    10)

galeri.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Folder_DCIM_Button'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Foto1_Button'), 
    0)

'Upload KTP Pasangan\r\n'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/FINA_Apply_Upload_KTP_Pasangan_Button'), 
    0)

MobileElement galeri2 = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/FINA_Apply_Upload_Galeri_Button'), 
    10)

galeri2.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Folder_DCIM_Button'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Foto2_Button'), 
    0)

Mobile.delay(2)

'SS Upload data KTP dan KTP Pasangan'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-13.6-form upload data') + '.png', FailureHandling.STOP_ON_FAILURE)

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

'end'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/FINA_Apply_Upload_Lanjut_Button'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Nama_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Nama', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Alamat_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Alamat', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Provinsi_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Provinsi', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Kota_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Kota', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Kodepos_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Kodepos', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Notlp1_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Notlp1', 1), 0)

'SS Cust data 1'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-13.7-form cust data 1') + '.png', FailureHandling.STOP_ON_FAILURE)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Notlp2_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Notlp2', 1), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Email_Text_id'), 
    findTestData('DMS_Apply Online').getObjectValue('Email', 1), 0)

'SS Cust data 2'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-17.4-form cust data 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Cust Data/FINA_Apply_CustData_Lanjut_Button'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Merk_Dropdown'), 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Merk-Model_Search_Text'), 
    findTestData('DMS_Apply Online').getObjectValue('Merk', 1), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_MerkList_Dropdownval'), 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Model_Dropdown'), 
    0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Merk-Model_Search_Text'), 
    findTestData('DMS_Apply Online').getObjectValue('Model', 1), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Model_Dropdownval'), 
    0)

Mobile.delay(3)

'SS Car Data'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-17.5-form car data') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Car Data/FINA_Apply_CarData_Simpan_Button'), 
    0)

Mobile.delay(2)

'SS Simpan Data Apply'
Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathapplyonline) + 'skenario-17.6-berhasil submit data') + '.png', FailureHandling.STOP_ON_FAILURE)

'e-kyc'


Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Folder_DCIM_Button'),
	0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/Upload Data/Android func/GalleryGo_Foto1_Button'),
	0)

Mobile.delay(3)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Simulasi Kredit_Apply Online/Apply Online/FINA_Apply_EKYC_Close_Button'), 
    0)

