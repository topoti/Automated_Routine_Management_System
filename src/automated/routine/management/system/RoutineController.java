/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.routine.management.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TextFieldTreeTableCell;

/**
 * FXML Controller class
 *
 * @author A
 */
public class RoutineController implements Initializable {

    @FXML
    private TreeTableView<String> T1;
    @FXML
    private TreeTableColumn<String, String> col1;
    TreeItem <String> itenum1 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itenum2 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itenum3 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itenum4 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itenum5 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent1 = new TreeItem <> ("Saturday");
    TreeItem <String> itenum6 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itenum7 = new TreeItem <> ("1-1 No Class");
    TreeItem <String> itenum8 = new TreeItem <> ("3-1 No Class"); 
    TreeItem <String> itenum9 = new TreeItem <> ("3-2 No Class");
    TreeItem <String> itenum10 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent2 = new TreeItem <> ("Sunday"); 
    TreeItem <String> itenum11 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itenum12 = new TreeItem <> ("2-1 No Class");
    TreeItem <String> item3 = new TreeItem <> ("CSE3104(RAR)Lab-02"); 
    TreeItem <String> itenum13 = new TreeItem <> ("3-2 No Class");
    TreeItem <String> itenum14 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent3 = new TreeItem <> ("Monday");
    TreeItem <String> itenum15 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itenum16 = new TreeItem <> ("1-1 No Class");
    TreeItem <String> itenum17 = new TreeItem <> ("3-1 No Class"); 
    TreeItem <String> itenum18 = new TreeItem <> ("3-2 No Class");
    TreeItem <String> itenum19 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent4 = new TreeItem <> ("Tuesday");
    TreeItem <String> itenum20 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itenum21 = new TreeItem <> ("1-1 No Class");
    TreeItem <String> itenum22 = new TreeItem <> ("3-1 No Class"); 
    TreeItem <String> item5 = new TreeItem <> ("CSE3204(MR)Lab-02");
    TreeItem <String> itenum23 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent5 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root = new TreeItem <> ("Day"); 
    
    @FXML
    private TreeTableView<String> t2;
    @FXML
    private TreeTableColumn<String, String> col2;
    TreeItem <String> item01 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> item02 = new TreeItem <> ("CSE2109(MHC)-2ndAB"); 
    TreeItem <String> item03 = new TreeItem <> ("CSE3106(MR)Lab-02");
    TreeItem <String> item04 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> item05 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent01 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> item06 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> item07 = new TreeItem <> ("CSE2103(MKN)-214");
    TreeItem <String> item08 = new TreeItem <> ("CSE3106(MR)Lab-01"); 
    TreeItem <String> item09 = new TreeItem <> ("CSE3206(MHR)Lab-02");
    TreeItem <String> item10 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent02 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> item11 = new TreeItem <> ("CSE1102(MI)Lab-01"); 
    TreeItem <String> item12 = new TreeItem <> ("CSE2103(MKN)-214"); 
    TreeItem <String> item13 = new TreeItem <> ("CSE3104(RAR)Lab-02"); 
    TreeItem <String> item14 = new TreeItem <> ("CSE3211(MSM)-215"); 
    TreeItem <String> item15 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent03 = new TreeItem <> ("Monday");
    
    TreeItem <String> item16 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> item17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> item18 = new TreeItem <> ("CSE3101(MKN)-214");
    TreeItem <String> item19 = new TreeItem <> ("CSE3204(MR)Lab-01"); 
    TreeItem <String> item20 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent04 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> item21 = new TreeItem <> ("MBS1880(SIB)-214");
    TreeItem <String> item22 = new TreeItem <> ("2-1 No Class");
    TreeItem <String> item23 = new TreeItem <> ("CSE3101(MKN)-215");
    TreeItem <String> item24 = new TreeItem <> ("CSE3204(MR)Lab-02"); 
    TreeItem <String> item25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent05 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root1 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t3;
    @FXML
    private TreeTableColumn<String, String> col3;
    TreeItem <String> itemn1 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemn2 = new TreeItem <> ("CSE2109(MHC)-2ndAB"); 
    TreeItem <String> itemn3 = new TreeItem <> ("CSE3106(MR)Lab-02");
    TreeItem <String> itemn4 = new TreeItem <> ("CSE3210(MI)Lab-01"); 
    TreeItem <String> itemn5 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent11 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itemn6 = new TreeItem <> ("CSE1109(MSA)-215"); 
    TreeItem <String> itemn7 = new TreeItem <> ("CSE2111(RPL)-214");
    TreeItem <String> itemn8 = new TreeItem <> ("CSE3106(MR)Lab-01"); 
    TreeItem <String> itemn9 = new TreeItem <> ("CSE3206(MHR)Lab-02");
    TreeItem <String> itemn10 = new TreeItem <> ("CSE4201(LYP)-2ndAB"); 
    TreeItem <String> parent12 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itemn11 = new TreeItem <> ("CSE1102(MI)Lab-01"); 
    TreeItem <String> itemn12 = new TreeItem <> ("CSE2109(MHC)-2ndAB"); 
    TreeItem <String> itemn13 = new TreeItem <> ("CSE3101(MKN)-214"); 
    TreeItem <String> itemn14 = new TreeItem <> ("CSE3205(MHR)-215"); 
    TreeItem <String> itemn15 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent13 = new TreeItem <> ("Monday");
    
    TreeItem <String> itemn16 = new TreeItem <> ("CSE1109(MSA)-214"); 
    TreeItem <String> itemn17 = new TreeItem <> ("CSE2103(MKN)-215"); 
    TreeItem <String> itemn18 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itemn19 = new TreeItem <> ("CSE3204(MR)Lab-01"); 
    TreeItem <String> itemn20 = new TreeItem <> ("CSE4206(DH)Lab-02"); 
    TreeItem <String> parent14 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itemn21 = new TreeItem <> ("MBS1880(SIB)-214");
    TreeItem <String> itemn22 = new TreeItem <> ("CSE211(RPL)-215");
    TreeItem <String> itemn23 = new TreeItem <> ("CSE3107(MI)Lab-01");
    TreeItem <String> itemn24 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itemn25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent15 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root2 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t4;
    @FXML
    private TreeTableColumn<String, String> col4;
    TreeItem <String> itemno1 = new TreeItem <> ("CSE1101(MMH)-214"); 
    TreeItem <String> itemno2 = new TreeItem <> ("CSE2104(MSM)Lab-02"); 
    TreeItem <String> itemno3 = new TreeItem <> ("CSE3105(MR)-2ndAB");
    TreeItem <String> itemno4 = new TreeItem <> ("CSE3210(MI)Lab-01"); 
    TreeItem <String> itemno5 = new TreeItem <> ("CSE4205(DH)-215"); 
    TreeItem <String> parent21 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itemno6 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemno7 = new TreeItem <> ("CSE2104(MSM)Lab-01");
    TreeItem <String> itemno8 = new TreeItem <> ("CSE3105(MR)-2ndAB"); 
    TreeItem <String> itemno9 = new TreeItem <> ("CSE3205(MHR)-214");
    TreeItem <String> itemno10 = new TreeItem <> ("CSE4205(DH)-215"); 
    TreeItem <String> parent22 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itemno11 = new TreeItem <> ("CSE1101(MMH)-214"); 
    TreeItem <String> itemno12 = new TreeItem <> ("CSE2105(MMR)-215"); 
    TreeItem <String> itemno13 = new TreeItem <> ("CSE3103(MHR)Lab-01"); 
    TreeItem <String> itemno14 = new TreeItem <> ("CSE3202(MSM)Lab-02"); 
    TreeItem <String> itemno15 = new TreeItem <> ("CSE4205(DH)-2ndAB"); 
    TreeItem <String> parent23 = new TreeItem <> ("Monday");
    
    TreeItem <String> itemno16 = new TreeItem <> ("CSE1104(LYP)Lab-01"); 
    TreeItem <String> itemno17 = new TreeItem <> ("CSE2105(MMR)-215"); 
    TreeItem <String> itemno18 = new TreeItem <> ("CSE3111(MSM)-2ndAB");
    TreeItem <String> itemno19 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itemno20 = new TreeItem <> ("CSE4206(DH)Lab-02"); 
    TreeItem <String> parent24 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itemno21 = new TreeItem <> ("CSE1103(LYP)-214");
    TreeItem <String> itemno22 = new TreeItem <> ("CSE2102(MSA)Lab-02");
    TreeItem <String> itemno23 = new TreeItem <> ("CSE3105(MR)-2ndAB");
    TreeItem <String> itemno24 = new TreeItem <> ("CSE3201(DH)-215"); 
    TreeItem <String> itemno25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent25 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root3 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t5;
    @FXML
    private TreeTableColumn<String, String> col5;
    TreeItem <String> itm1 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itm2 = new TreeItem <> ("CSE2104(MSM)Lab-02"); 
    TreeItem <String> itm3 = new TreeItem <> ("CSE3107(MI)Lab-01");
    TreeItem <String> itm4 = new TreeItem <> ("CSE3201(DH)-214"); 
    TreeItem <String> itm5 = new TreeItem <> ("CSE4203(MMH)-215"); 
    TreeItem <String> parent31 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itm6 = new TreeItem <> ("CSE1107(DMAR)-214"); 
    TreeItem <String> itm7 = new TreeItem <> ("CSE2104(MSM)Lab-01");
    TreeItem <String> itm8 = new TreeItem <> ("CSE3103(MHR)-2ndAB"); 
    TreeItem <String> itm9 = new TreeItem <> ("3-2 No Class");
    TreeItem <String> itm10 = new TreeItem <> ("CSE4203(MMH)-215"); 
    TreeItem <String> parent32 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itm11 = new TreeItem <> ("CSE1103(LYP)-214"); 
    TreeItem <String> itm12 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itm13 = new TreeItem <> ("CSE3103(MHR)Lab-01"); 
    TreeItem <String> itm14 = new TreeItem <> ("CSE3202(MSM)Lab-02"); 
    TreeItem <String> itm15 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent33 = new TreeItem <> ("Monday");
    
    TreeItem <String> itm16 = new TreeItem <> ("CSE1104(LYP)Lab-01"); 
    TreeItem <String> itm17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itm18 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itm19 = new TreeItem <> ("CSE3203(MMR)-214"); 
    TreeItem <String> itm20 = new TreeItem <> ("CSE4203(MMH)-215"); 
    TreeItem <String> parent34 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itm21 = new TreeItem <> ("CSE1105(MSI)-214");
    TreeItem <String> itm22 = new TreeItem <> ("CSE2102(MSA)Lab-02");
    TreeItem <String> itm23 = new TreeItem <> ("CSE3111(MSM)Lab-01");
    TreeItem <String> itm24 = new TreeItem <> ("CSE3209(MI)-215"); 
    TreeItem <String> itm25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent35 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root4 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t6;
    @FXML
    private TreeTableColumn<String, String> col6;
    @FXML
    private TreeTableView<String> t7;
    @FXML
    private TreeTableColumn<String, String> col7;
    TreeItem <String> itmn1 = new TreeItem <> ("CSE1102(MI)Lab-01"); 
    TreeItem <String> itmn2 = new TreeItem <> ("CSE2101(MSA)-214"); 
    TreeItem <String> itmn3 = new TreeItem <> ("CSE3109(RAR)-215");
    TreeItem <String> itmn4 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itmn5 = new TreeItem <> ("CSE4204(MMH)Lab-02"); 
    TreeItem <String> parent51 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itmn6 = new TreeItem <> ("CSE1105(MSI)-215"); 
    TreeItem <String> itmn7 = new TreeItem <> ("CSE2102(MSA)Lab-02");
    TreeItem <String> itmn8 = new TreeItem <> ("CSE3109(RAR)Lab-01"); 
    TreeItem <String> itmn9 = new TreeItem <> ("CSE3209(MI)-214");
    TreeItem <String> itmn10 = new TreeItem <> ("CSE4207(MR)-2ndAB"); 
    TreeItem <String> parent52 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itmn11 = new TreeItem <> ("CSE1111(MMA)-214"); 
    TreeItem <String> itmn12 = new TreeItem <> ("CSE2107(MCB)-2ndAB"); 
    TreeItem <String> itmn13 = new TreeItem <> ("CSE3107(MI)Lab-02"); 
    TreeItem <String> itmn14 = new TreeItem <> ("CSE3206(MHR)Lab-01"); 
    TreeItem <String> itmn15 = new TreeItem <> ("CSE4207(MR)-215"); 
    TreeItem <String> parent53 = new TreeItem <> ("Monday");
    
    TreeItem <String> itmn16 = new TreeItem <> ("CSE1111(MMA)-214"); 
    TreeItem <String> itmn17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itmn18 = new TreeItem <> ("CSE3110(RAR)Lab-02");
    TreeItem <String> itmn19 = new TreeItem <> ("CSE3208(MSA)Lab-01"); 
    TreeItem <String> itmn20 = new TreeItem <> ("CSE4207(MR)-215"); 
    TreeItem <String> parent54 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itmn21 = new TreeItem <> ("1-1 No Class");
    TreeItem <String> itmn22 = new TreeItem <> ("CSE2101(MSA)-214");
    TreeItem <String> itmn23 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmn24 = new TreeItem <> ("CSE3210(MI)Lab-02"); 
    TreeItem <String> itmn25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent55 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root6 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t8;
    @FXML
    private TreeTableColumn<String, String> col8;
    TreeItem <String> itmno1 = new TreeItem <> ("CSE1102(MI)Lab-01"); 
    TreeItem <String> itmno2 = new TreeItem <> ("CSE2106(MMR)E-Lab"); 
    TreeItem <String> itmno3 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmno4 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itmno5 = new TreeItem <> ("CSE4204(MMH)Lab-02"); 
    TreeItem <String> parent61 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itmno6 = new TreeItem <> ("CSE1105(MSI)-215"); 
    TreeItem <String> itmno7 = new TreeItem <> ("CSE2102(MSA)Lab-02");
    TreeItem <String> itmno8 = new TreeItem <> ("CSE3102(MKN)Lab-01"); 
    TreeItem <String> itmno9 = new TreeItem <> ("CSE3203(MMR)-214");
    TreeItem <String> itmno10 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent62 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itmno11 = new TreeItem <> ("CSE1109(MSA)-214"); 
    TreeItem <String> itmno12 = new TreeItem <> ("CSE2107(MCB)-2ndAB"); 
    TreeItem <String> itmno13 = new TreeItem <> ("CSE3102(MKN)Lab-02"); 
    TreeItem <String> itmno14 = new TreeItem <> ("CSE3206(MHR)Lab-01"); 
    TreeItem <String> itmno15 = new TreeItem <> ("CSE4201(LYP)-215"); 
    TreeItem <String> parent63 = new TreeItem <> ("Monday");
    
    TreeItem <String> itmno16 = new TreeItem <> ("CSE1101(MSA)-214"); 
    TreeItem <String> itmno17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itmno18 = new TreeItem <> ("CSE3110(RAR)Lab-02");
    TreeItem <String> itmno19 = new TreeItem <> ("CSE3208(MSA)Lab-01"); 
    TreeItem <String> itmno20 = new TreeItem <> ("CSE4201(LYP)-215"); 
    TreeItem <String> parent64 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itmno21 = new TreeItem <> ("CSE1107(DMAR)-215");
    TreeItem <String> itmno22 = new TreeItem <> ("CSE2105(MMR)-214");
    TreeItem <String> itmno23 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmno24 = new TreeItem <> ("CSE3210(MI)Lab-02"); 
    TreeItem <String> itmno25 = new TreeItem <> ("CSE4206(DH)Lab-01"); 
    TreeItem <String> parent65 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root7 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t9;
    @FXML
    private TreeTableColumn<String, String> col9;
    TreeItem <String> itmnum1 = new TreeItem <> ("CSE1102(MI)Lab-01"); 
    TreeItem <String> itmnum2 = new TreeItem <> ("CSE2106(MMR)E-Lab"); 
    TreeItem <String> itmnum3 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmnum4 = new TreeItem <> ("CSE3208(MSA)Lab-02"); 
    TreeItem <String> itmnum5 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent71 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itmnum6 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itmnum7 = new TreeItem <> ("CSE2107(MCB)-215");
    TreeItem <String> itmnum8 = new TreeItem <> ("CSE3102(MKN)Lab-01"); 
    TreeItem <String> itmnum9 = new TreeItem <> ("CSE3201(DH)-214");
    TreeItem <String> itmnum10 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent72 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itmnum11 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itmnum12 = new TreeItem <> ("CSE2101(MSA)-215"); 
    TreeItem <String> itmnum13 = new TreeItem <> ("CSE3102(MKN)Lab-02"); 
    TreeItem <String> itmnum14 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itmnum15 = new TreeItem <> ("CSE4202(LYP)Lab-01"); 
    TreeItem <String> parent73 = new TreeItem <> ("Monday");
    
    TreeItem <String> itmnum16 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itmnum17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itmnum18 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmnum19 = new TreeItem <> ("CSE3202(MSM)Lab-01"); 
    TreeItem <String> itmnum20 = new TreeItem <> ("CSE4204(MMH)Lab-02"); 
    TreeItem <String> parent74 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itmnum21 = new TreeItem <> ("CSE1107(DMAR)-215");
    TreeItem <String> itmnum22 = new TreeItem <> ("2-1 No Class");
    TreeItem <String> itmnum23 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itmnum24 = new TreeItem <> ("CSE3203(MMR)-215"); 
    TreeItem <String> itmnum25 = new TreeItem <> ("CSE4206(DH)Lab-01"); 
    TreeItem <String> parent75 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root8 = new TreeItem <> ("Day"); 
    @FXML
    private TreeTableView<String> t10;
    @FXML
    private TreeTableColumn<String, String> col10;
    TreeItem <String> itemnum1 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemnum2 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itemnum3 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itemnum4 = new TreeItem <> ("CSE3208(MSA)Lab-02"); 
    TreeItem <String> itemnum5 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent81 = new TreeItem <> ("Saturday"); 
    
    TreeItem <String> itemnum6 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemnum7 = new TreeItem <> ("2-1 No Class");
    TreeItem <String> itemnum8 = new TreeItem <> ("3-1 No Class"); 
    TreeItem <String> itemnum9 = new TreeItem <> ("3-2 No Class");
    TreeItem <String> itemnum10 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent82 = new TreeItem <> ("Sunday"); 
    
    TreeItem <String> itemnum11 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemnum12 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itemnum13 = new TreeItem <> ("3-1 No Class"); 
    TreeItem <String> itemnum14 = new TreeItem <> ("3-2 No Class"); 
    TreeItem <String> itemnum15 = new TreeItem <> ("CSE4202(LYP)Lab-01"); 
    TreeItem <String> parent83 = new TreeItem <> ("Monday");
    
    TreeItem <String> itemnum16 = new TreeItem <> ("1-1 No Class"); 
    TreeItem <String> itemnum17 = new TreeItem <> ("2-1 No Class"); 
    TreeItem <String> itemnum18 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itemnum19 = new TreeItem <> ("CSE3202(MSM)Lab-01"); 
    TreeItem <String> itemnum20 = new TreeItem <> ("CSE4204(MMH)Lab-02"); 
    TreeItem <String> parent84 = new TreeItem <> ("Tuesday");
    
    TreeItem <String> itemnum21 = new TreeItem <> ("1-1 No Class");
    TreeItem <String> itemnum22 = new TreeItem <> ("2-1 No Class");
    TreeItem <String> itemnum23 = new TreeItem <> ("3-1 No Class");
    TreeItem <String> itemnum24 = new TreeItem <> ("CSE3211(MSM)-215"); 
    TreeItem <String> itemnum25 = new TreeItem <> ("4-2 No Class"); 
    TreeItem <String> parent85 = new TreeItem <> ("Wednesday"); 

    TreeItem <String> root9 = new TreeItem <> ("Day"); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       parent1.getChildren().setAll(itenum1,itenum2,itenum3,itenum4,itenum5);
       parent2.getChildren().setAll(itenum6,itenum7,itenum8,itenum9,itenum10);
       parent3.getChildren().setAll(itenum11,itenum12,item3,itenum13,itenum14);
       parent4.getChildren().setAll(itenum15,itenum16,itenum17,itenum18,itenum19);
       parent5.getChildren().setAll(itenum20,itenum21,itenum22,item5,itenum23);
       
            root.getChildren().setAll(parent1,parent2,parent3,parent4,parent5);
            
       col1.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col1.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       T1.setEditable(true);
            T1.setRoot(root);
           //2nd 
       parent01.getChildren().setAll(item01,item02,item03,item04,item05);
       parent02.getChildren().setAll(item06,item07,item08,item09,item10);
       parent03.getChildren().setAll(item11,item12,item13,item14,item15);
       parent04.getChildren().setAll(item16,item17,item18,item19,item20);
       parent05.getChildren().setAll(item21,item22,item23,item24,item25);
       
            root1.getChildren().setAll(parent01,parent02,parent03,parent04,parent05);
            
       col2.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col2.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t2.setEditable(true);
            t2.setRoot(root1);
            //3rd
       parent11.getChildren().setAll(itemn1,itemn2,itemn3,itemn4,itemn5);
       parent12.getChildren().setAll(itemn6,itemn7,itemn8,itemn9,itemn10);
       parent13.getChildren().setAll(itemn11,itemn12,itemn13,itemn14,itemn15);
       parent14.getChildren().setAll(itemn16,itemn17,itemn18,itemn19,itemn20);
       parent15.getChildren().setAll(itemn21,itemn22,itemn23,itemn24,itemn25);
       
            root2.getChildren().setAll(parent11,parent12,parent13,parent14,parent15);
            
       col3.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col3.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t3.setEditable(true);
            t3.setRoot(root2);
            //4th
       parent21.getChildren().setAll(itemno1,itemno2,itemno3,itemno4,itemno5);
       parent22.getChildren().setAll(itemno6,itemno7,itemno8,itemno9,itemno10);
       parent23.getChildren().setAll(itemno11,itemno12,itemno13,itemno14,itemno15);
       parent24.getChildren().setAll(itemno16,itemno17,itemno18,itemno19,itemno20);
       parent25.getChildren().setAll(itemno21,itemno22,itemno23,itemno24,itemno25);
       
            root3.getChildren().setAll(parent21,parent22,parent23,parent24,parent25);
            
       col4.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col4.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t4.setEditable(true);
            t4.setRoot(root3);
            //5th
       parent31.getChildren().setAll(itm1,itm2,itm3,itm4,itm5);
       parent32.getChildren().setAll(itm6,itm7,itm8,itm9,itm10);
       parent33.getChildren().setAll(itm11,itm12,itm13,itm14,itm15);
       parent34.getChildren().setAll(itm16,itm17,itm18,itm19,itm20);
       parent35.getChildren().setAll(itm21,itm22,itm23,itm24,itm25);
       
            root4.getChildren().setAll(parent31,parent32,parent33,parent34,parent35);
            
       col5.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col5.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t5.setEditable(true);
            t5.setRoot(root4);
            //7th
       parent51.getChildren().setAll(itmn1,itmn2,itmn3,itmn4,itmn5);
       parent52.getChildren().setAll(itmn6,itmn7,itmn8,itmn9,itmn10);
       parent53.getChildren().setAll(itmn11,itmn12,itmn13,itmn14,itmn15);
       parent54.getChildren().setAll(itmn16,itmn17,itmn18,itmn19,itmn20);
       parent55.getChildren().setAll(itmn21,itmn22,itmn23,itmn24,itmn25);
       
            root6.getChildren().setAll(parent51,parent52,parent53,parent54,parent55);
            
       col7.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col7.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t7.setEditable(true);
            t7.setRoot(root6);
            //8th
       parent61.getChildren().setAll(itmno1,itmno2,itmno3,itmno4,itmno5);
       parent62.getChildren().setAll(itmno6,itmno7,itmno8,itmno9,itmno10);
       parent63.getChildren().setAll(itmno11,itmno12,itmno13,itmno14,itmno15);
       parent64.getChildren().setAll(itmno16,itmno17,itmno18,itmno19,itmno20);
       parent65.getChildren().setAll(itmno21,itmno22,itmno23,itmno24,itmno25);
       
            root7.getChildren().setAll(parent61,parent62,parent63,parent64,parent65);
            
       col8.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col8.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t8.setEditable(true);
            t8.setRoot(root7);
            //9th
       parent71.getChildren().setAll(itmnum1,itmnum2,itmnum3,itmnum4,itmnum5);
       parent72.getChildren().setAll(itmnum6,itmnum7,itmnum8,itmnum9,itmnum10);
       parent73.getChildren().setAll(itmnum11,itmnum12,itmnum13,itmnum14,itmnum15);
       parent74.getChildren().setAll(itmnum16,itmnum17,itmnum18,itmnum19,itmnum20);
       parent75.getChildren().setAll(itmnum21,itmnum22,itmnum23,itmnum24,itmnum25);
       
            root8.getChildren().setAll(parent71,parent72,parent73,parent74,parent75);
            
       col9.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col9.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t9.setEditable(true);
            t9.setRoot(root8);
            //10th
       parent81.getChildren().setAll(itemnum1,itemnum2,itemnum3,itemnum4,itemnum5);
       parent82.getChildren().setAll(itemnum6,itemnum7,itemnum8,itemnum9,itemnum10);
       parent83.getChildren().setAll(itemnum11,itemnum12,itemnum13,itemnum14,itemnum15);
       parent84.getChildren().setAll(itemnum16,itemnum17,itemnum18,itemnum19,itemnum20);
       parent85.getChildren().setAll(itemnum21,itemnum22,itemnum23,itemnum24,itemnum25);
       
            root9.getChildren().setAll(parent81,parent82,parent83,parent84,parent85);
            
       col10.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String>param) -> new SimpleStringProperty(param.getValue().getValue()));
            
       col10.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
       t10.setEditable(true);
            t10.setRoot(root9);
    }    
    
}
