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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/v1/')

WebUI.setText(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_()_uid'), 'mngr358145')

WebUI.setText(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_()_password'), 'zytahur')

WebUI.click(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_mandatory field_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_GTPL Bank Manager HomePage/a_New Customer'))

WebUI.click(findTestObject('Object Repository/Page_Gtpl Bank New Customer Entry Page/input__name'))

WebUI.setText(findTestObject('Page_Gtpl Bank New Customer Entry Page/input__name'), cusName)

WebUI.click(findTestObject('Page_Gtpl Bank New Customer Entry Page/textarea__addr'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Gtpl Bank New Customer Entry Page/label_CusNameError'), result, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

