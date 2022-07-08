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

WebUI.navigateToUrl('https://bioskoponline.com/')

WebUI.click(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/input_Atau_username'), '08783678335')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/input__w-1112 border-b bg-transparent focus_2ef071'), 
    '2M3tWc81TKQ=')

WebUI.click(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/path'))

WebUI.click(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/path_1'))

WebUI.click(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/path'))

WebUI.click(findTestObject('Object Repository/Page_Bioskop Online/Page_Bioskop Online/path_1'))

