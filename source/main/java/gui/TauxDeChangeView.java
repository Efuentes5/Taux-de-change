package gui;

import model.Money;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fuentes Enzo on 02/12/2015.
 */
public class TauxDeChangeView extends JFrame{

        Money euro = new Money("euro", 1);
        Money dollar = new Money ("dollar", 1.0569);
        Money livre = new Money("livre", 0.7102);
        Money yen = new Money("yen", 130.9395);
        public List<Money> ListMoney;
        public void remplirlist(){
            ListMoney.add(euro);
            ListMoney.add(dollar);
            ListMoney.add(livre);
            ListMoney.add(yen);
        }


        String[] devise1String = {euro.getname(), dollar.getname(), livre.getname(), yen.getname()};
        String[] devise2String = {euro.getname(), dollar.getname(), livre.getname(), yen.getname()};


        private JComboBox devise1List = new JComboBox(devise1String);
        private JComboBox devise2List = new JComboBox(devise2String);
        private JTextField firstNumber  = new JTextField(15);
        private JButton calculateButton = new JButton("Calculate");
        private JTextField calcSolution = new JTextField(15);



        public TauxDeChangeView(){

            ListMoney = new ArrayList<>();

            JPanel calcPanel = new JPanel();

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(600, 200);

            calcPanel.add(firstNumber);
            calcPanel.add(devise1List);
            calcPanel.add(calculateButton);
            calcPanel.add(calcSolution);
            calcPanel.add(devise2List);


            this.add(calcPanel);

        }

        public double getFirstNumber(){

            return Double.parseDouble(firstNumber.getText());

        }

        public String getmoney1(){
            return devise1List.getSelectedItem().toString();
        }

        public String getmoney2(){
            return devise2List.getSelectedItem().toString();
        }

        public double getCalcSolution(){

            return Double.parseDouble(calcSolution.getText());

        }

        public void setCalcSolution(double solution){

            calcSolution.setText(Double.toString(solution));

        }


        void addCalculateListener(ActionListener listenForCalcButton){

            calculateButton.addActionListener(listenForCalcButton);

        }

        void displayErrorMessage(String errorMessage){

            JOptionPane.showMessageDialog(this, errorMessage);

        }


}
