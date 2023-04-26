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

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Login/android.widget.Button - TIDAK'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Homescreen/Button Menu Lainnya'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Homescreen/Button Upgrade 1'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('APN_Fina New Versi/List Data/Upgrade 1-1'), 0)

Mobile.delay(15)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-1.3-list kendaraan') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Tenor2_Checkbox'), 0)

Mobile.delay(2)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-1.4-pilih tenor') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

MobileElement Lanjutkan1 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Lanjutkan_Button'), 
    10)

Lanjutkan1.click()

Mobile.swipe(0, 800, 0, 200)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/Radio Comprehensive - TLO 2'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/RSMB 2'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/RSCC 2'), 0)

not_run: Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/TJH 10 2'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/TJH 25 2'), 0)

not_run: Mobile.tap(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/TJH 50 2'), 0)

not_run: 'start'

'Get Device Height and Store in device_height variable'
not_run: device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
not_run: device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
not_run: int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
not_run: int endX = startX

'Storing the startY value'
not_run: int startY = device_Height * 0.30

'Storing the endY value'
not_run: int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
not_run: Mobile.swipe(startX, endY, endX, startY)

not_run: Mobile.comment('end')

not_run: Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Perluasan_BencanaAlam2_Checkbox'), 
    0)

not_run: Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Perluasan_RSCC2_Checkbox'), 
    0)

not_run: Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Perluasan_TJH25_2_Checkbox'), 
    0)

Mobile.delay(20)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-1.5-pilih jenis upgrade') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

MobileElement Lanjutkan2 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_PilihAsuransidanPerluasan_Lanjutkan_Button'), 
    10)

Lanjutkan2.click()

Mobile.setText(findTestObject('APN_FINA_MOBILE/Upgrade Asuransi/Upgrade - Input No Telp'), '085789902341', 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-1.6-konfirmasi upgrade') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

MobileElement Submit = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Konfirmasi_Submit_Button'), 
    10)

Submit.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Konfirmasi_Ya_Button'), 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-1.7-proses submit berhasil') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Submit_Kembali_Button'), 0)

Mobile.pressBack()

'back to home menu'
Mobile.pressBack()

MobileElement Account = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

Account.click()

