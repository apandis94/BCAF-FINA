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

Mobile.startApplication('D:\\GitHub\\katalon-fina\\apps\\app-uat-release-sprint-11 (06052021).apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (1)'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (2)'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.TextView - Lihat Semua Promo'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.TextView - Lihat Semua'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.swipe(0, 500, 0, 200)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.TextView - Lihat Semua (1)'), 
    0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (4)'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (5)'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (6)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.ImageView (7)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.Button - Login (1)'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Email'), 'yudiekoputra@gmail.com', 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Login'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Password'), '123456', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Login (1)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.TextView - Daftar disini'), 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - Nama'), 'Yudi', 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - Email (2)'), 
    'yudiekoputragmail.com', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - yudiekoputragmail.com (2)'), 
    'yudi_putra@bcafinance.id', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - No KTP (NIK)'), 
    '123456789', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - 123456789'), 
    '1234567891123456', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.EditText - Tanggal Lahir'), 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.Button - OKE'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.EditText - Tanggal Lahir'), 0)

Mobile.delay(2)

Mobile.tapAndHold(findTestObject('Application/sprint 2 - register/android.widget.Button - 18 (1)'), 0, 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - OKE'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.CheckBox'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - 1234567891123456'), '1230984568764684', 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Daftar'), 0)

Mobile.pressBack()

Mobile.delay(2)

Mobile.setText(findTestObject('null'), 'yudi.1106@gmail.com', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Password'), 'tUUYC9', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Login (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Password Baru'), 'yudi11', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Ulangi Password Baru'), 'yudi11', 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Application/sprint 2 - register/android.widget.Button - Ubah Password'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Email'), 'yudi.1106@gmail.com', 
    0)

Mobile.delay(2)

Mobile.setText(findTestObject('Application/sprint 2 - register/android.widget.EditText - Password'), 'yudi11', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.Button - Login (1)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Application/sprint 2 - register/android.widget.ImageView (7)'), 0)

Mobile.delay(2)

Mobile.closeApplication()

