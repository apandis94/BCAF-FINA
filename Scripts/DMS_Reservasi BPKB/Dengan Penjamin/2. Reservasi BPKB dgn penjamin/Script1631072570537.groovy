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

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_Menu_More_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/FINA_More_List_Layanan Konsumen_Dropdown'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/Layanan Konsumen/FINA_More_LayKons_ReservasiBPKB_Button'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathreservasibpkb2) + 'skenario-2.1-list kendaraan') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_List1_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_LokasiPengambilan_Dropdown'), 0)

Mobile.setText(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_LokasiPengambilan_Search_Text'), 'kantor pusat', 
    0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_LokasiPengambilan_List1_Dropdownval'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_KTPKuasa_Tgl pengambilan_Button'), 0, FailureHandling.STOP_ON_FAILURE)

'datepicker tgl 20 Sep 21'
Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_Datepicker_200821_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_Datepicker_OK_Button'), 0)

MobileElement jam = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_JamPengambilan_Button'), 
    10)

jam.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_JamPengambilan_Res Tersedia_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_JamPengambilan_Pilih_Button'), 0)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathreservasibpkb2) + 'skenario-2.2-input pengajuan reservasi') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_Lanjutkan_Button'), 0)

Mobile.delay(1)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathreservasibpkb2) + 'skenario-2.3-konfirmasi pengajuan reservasi') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_Kofirmasi_Lanjut_Button'), 0)

Mobile.delay(1)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathreservasibpkb2) + 'skenario-2.4-syarat dan ketentuan') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Reservasi BPKB/FINA_ResvBPKB_SyaratdanKetentuan_Setuju_Button'), 0)

Mobile.delay(1)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathreservasibpkb2) + 'skenario-2.5-tampilan billing') + '.png', FailureHandling.STOP_ON_FAILURE)

