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

/**
 * Fecha: 6-10-2022.
 * QA: Santiago Marrugo.
 * Descripcion: Diligenciamiento de formulario de prueba Sophos.
 */

WebUI.openBrowser("")
WebUI.delay(1)
WebUI.navigateToUrl("https://tasks.evalartapp.com/automatization/forms/test")
WebUI.delay(1)
WebUI.maximizeWindow()
WebUI.delay(1)
//Se incia sesion
WebUI.focus(findTestObject('CICLO1/InputUserName'))
WebUI.setText(findTestObject('CICLO1/InputUserName'), '466765')
WebUI.setText(findTestObject('CICLO1/InputPassword'), '10df2f32286b7120Mi00LTU2NzY2NA==30e0c83e6c29f1c3')
WebUI.click(findTestObject('CICLO1/BotonLogin'))
WebUI.delay(1)
//Se verifica que estemos dentro de la pagina despues de iniciar sesion
WebUI.verifyTextPresent('Prueba de automatización', false)

//CICLO 1
WebUI.verifyTextPresent('Se encuentra en el ciclo 1 de 10', false)
WebUI.focus(findTestObject('CICLO1/InputFecha'))
WebUI.setText(findTestObject('CICLO1/InputFecha'), '21072022')
WebUI.click(findTestObject('CICLO1/ChekboxMultiplodeSiete'))
WebUI.setText(findTestObject('CICLO1/TextAreaCantidadDeLetrasG'), 'GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG')
WebUI.setText(findTestObject('CICLO1/InputNumeroSecuencia'), '17')
WebUI.click(findTestObject('CICLO1/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 2 de 10', false)

//CICLO 2
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_1'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_2'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_3'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_4'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_5'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_6'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_7'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_8'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_9'))
WebUI.click(findTestObject('Object Repository/CICLO2/ChekMultiplo2_10'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO2/DDOperacionMat_1'), '-506305', false)
WebUI.setText(findTestObject('Object Repository/CICLO2/TexAreaLetraF'), 'ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff')
WebUI.click(findTestObject('Object Repository/CICLO2/RadioBtnOperacionMat_2'))
WebUI.click(findTestObject('CICLO2/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 3 de 10', false)

//CICLO 3 
WebUI.setText(findTestObject('Object Repository/CICLO3/InputNumeroSecuencia'), '10')
WebUI.setText(findTestObject('Object Repository/CICLO3/InputFecha'), '14122022')
WebUI.click(findTestObject('Object Repository/CICLO3/ChekMultiplo7_1'))
WebUI.click(findTestObject('Object Repository/CICLO3/ChekMultiplo7_2'))
WebUI.click(findTestObject('Object Repository/CICLO3/RadioBtnOperacionMat_1'))
WebUI.click(findTestObject('CICLO3/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 4 de 10', false)

//CICLO 4
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO4/DDOperacionMat_1'), '-206102298', false)
WebUI.click(findTestObject('Object Repository/CICLO4/ChekMultiplo6_1'))
WebUI.click(findTestObject('Object Repository/CICLO4/ChekMultiplo6_2'))
WebUI.click(findTestObject('Object Repository/CICLO4/ChekMultiplo6_3'))
WebUI.click(findTestObject('Object Repository/CICLO4/RadioBtnOperacionMat_2'))
WebUI.setText(findTestObject('Object Repository/CICLO4/InputNumeroSecuencia'), '17')
WebUI.click(findTestObject('CICLO4/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 5 de 10', false)

//CICLO 5
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO5/DDOperacionMat_1'), '49424193', false)
WebUI.setText(findTestObject('Object Repository/CICLO5/TextAreaLetraJ'), 'JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ')
WebUI.setText(findTestObject('Object Repository/CICLO5/InputNumeroSecuencia'), '11')
WebUI.click(findTestObject('Object Repository/CICLO5/RadioBtnOperacionMat_2'))
WebUI.click(findTestObject('Object Repository/CICLO5/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 6 de 10', false)

//CICLO 6
WebUI.setText(findTestObject('Object Repository/CICLO6/InputNumeroSecuencia'), '16')
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO6/DDOperacionMat_1'), '900390', false)
WebUI.click(findTestObject('Object Repository/CICLO6/RadioBtnOperacionMat_2'))
WebUI.click(findTestObject('Object Repository/CICLO6/ChekMultiplo8_1'))
WebUI.click(findTestObject('Object Repository/CICLO6/ChekMultiplo8_2'))
WebUI.click(findTestObject('Object Repository/CICLO6/ChekMultiplo8_3'))
WebUI.click(findTestObject('Object Repository/CICLO6/ChekMultiplo8_4'))
WebUI.click(findTestObject('Object Repository/CICLO6/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 7 de 10', false)

//CICLO 7
WebUI.setText(findTestObject('Object Repository/CICLO7/TextAreaLetraN'), 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN')
WebUI.setText(findTestObject('Object Repository/CICLO7/InputNumeroSecuencia'), '11')
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO7/DDOperacionMat_1'), '2871285', false)
WebUI.click(findTestObject('Object Repository/CICLO7/RadionBtnOperacionMat_2'))
WebUI.click(findTestObject('Object Repository/CICLO7/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 8 de 10', false)

//CICLO 8
WebUI.setText(findTestObject('Object Repository/CICLO8/InputFecha'), '22122022')
WebUI.click(findTestObject('Object Repository/CICLO8/RadioBtnOperacionMat_1'))
WebUI.click(findTestObject('Object Repository/CICLO8/ChekMultiplo5_1'))
WebUI.click(findTestObject('Object Repository/CICLO8/ChekMultiplo5_2'))
WebUI.click(findTestObject('Object Repository/CICLO8/ChekMultiplo5_3'))
WebUI.click(findTestObject('Object Repository/CICLO8/ChekMultiplo5_4'))
WebUI.setText(findTestObject('Object Repository/CICLO8/InputNumeroSecuencia'), '8')


WebUI.click(findTestObject('Object Repository/CICLO8/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 9 de 10', false)

//CICLO 9
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO9/DDOperacionMat_1'), '26766', false)
WebUI.setText(findTestObject('Object Repository/CICLO9/InputNumeroSecuencia'), '17')
WebUI.setText(findTestObject('Object Repository/CICLO9/InputFecha'), '21012023')
WebUI.setText(findTestObject('Object Repository/CICLO9/TextAreaLetrai'), 'iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii')
WebUI.click(findTestObject('Object Repository/CICLO9/BotonEnviar'))
WebUI.delay(1)
WebUI.verifyTextPresent('Se encuentra en el ciclo 10 de 10', false)

//CICLO 10
WebUI.selectOptionByValue(findTestObject('Object Repository/CICLO10/DDOperacionMat_1'), '-4964', false)
WebUI.click(findTestObject('Object Repository/CICLO10/RadioBtnOperacionMat_2'))
WebUI.setText(findTestObject('Object Repository/CICLO10/TextAreaLetrak'), 'kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk')
WebUI.setText(findTestObject('Object Repository/CICLO10/InputFecha'), '22112022')
WebUI.click(findTestObject('Object Repository/CICLO10/BotonEnviar'))











































