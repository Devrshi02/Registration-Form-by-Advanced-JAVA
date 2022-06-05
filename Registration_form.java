package com.ApnaCollege;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration_form extends Frame implements ActionListener {
//here showing many keywords like label ,textfield
Label lbTittle,lbName,lbFatherName,lbAge,lbGender,lbCourse,lbHobbies,lbAddress;
TextField tName,tFatherName,tAge;
Checkbox male,female,Drawing,Singing,Music,Others;
CheckboxGroup cbg;
Choice Course;
TextArea tAddress;
Button btnSave,btnClear;

//    this is the constructor of class
    Registration_form()
     {
//         this for web based
        setVisible(true);
        setSize(3000,3000);
        setTitle("Registration form");
//         FlowLayout f =new FlowLayout();
        setLayout(null);
         Color c=new Color(153, 152, 157);
         setBackground(c);

//this is the font of entier program
         Font titleFont = new Font("arial", Font.BOLD, 25);
         Font labelFont =new  Font("arial", Font.PLAIN, 18);
         Font textFont =new  Font("arial", Font.PLAIN, 15);

//         Registration label
         lbTittle=new Label("Registration Form");
         lbTittle.setFont(titleFont);
         lbTittle.setBounds(250,50,220,50);
         lbTittle.setForeground(Color.yellow);
         add(lbTittle);

//        name label
         lbName=new Label("Name:");
        lbName.setBounds(250,100,150,30);
        lbName.setFont(labelFont);
        lbName.setForeground(Color.white);
        add(lbName);

//        Textfield area for name
        tName=new TextField();
        tName.setFont(textFont);
        tName.setBounds(400,100,250,30);
        add(tName);
//    Father label
         lbFatherName=new Label("Father Name:");
         lbFatherName.setBounds(250,150,150,30);
         lbFatherName.setFont(labelFont);
         lbFatherName.setForeground(Color.white);
         add(lbFatherName);
//      Father TextField
         tFatherName=new TextField();
         tFatherName.setFont(textFont);
         tFatherName.setBounds(400,150,350,30);
         add(tFatherName);

//         Age Label
         lbAge=new Label("Age:");
         lbAge.setBounds(250,200,150,30);
         lbAge.setFont(labelFont);
         lbAge.setForeground(Color.white);
         add(lbAge);

//         Age TextField
         tAge=new TextField();
         tAge.setFont(textFont);
         tAge.setBounds(400,200,350,30);
         add(tAge);

//         Gender label
         lbGender=new Label("Gender:");
         lbGender.setBounds(250,250,150,30);
         lbGender.setFont(labelFont);
         lbGender.setForeground(Color.white);
         add(lbGender);

         cbg=new CheckboxGroup();

//         checkBox for Gender
        male=new Checkbox("male",cbg,true);
        male.setBounds(400,250,60,30);
        male.setFont(labelFont);
        male.setForeground(Color.white);
        add(male);
//        checkBox for female
        female=new Checkbox("female",cbg,true);
        female.setBounds(470,250,80,30);
        female.setFont(labelFont);
        female.setForeground(Color.white);
        add(female);

//        Course label
         lbCourse=new Label("Course:");
         lbCourse.setBounds(250,300,150,30);
         lbCourse.setFont(labelFont);
         lbCourse.setForeground(Color.white);
         add(lbCourse);

//         Course Choice
         Course=new Choice();
         Course.setFont(labelFont);
         Course.setBounds(400,300,250,30);
         Course.add("c");
         Course.add("c++");
         Course.add("python");
         Course.add("java");
         Course.add("java advanced");
         add(Course);

//       lbHobbiesHobbies label
         lbHobbies=new Label("Hobbies:");
         lbHobbies.setBounds(250,350,150,30);
         lbHobbies.setFont(labelFont);
         lbHobbies.setForeground(Color.white);
         add(lbHobbies);

         Drawing=new Checkbox("Drawing");
         Drawing.setFont(textFont);
         Drawing.setForeground(Color.white);
         Drawing.setBounds(400,350,70,30);
         add(Drawing);

         Drawing=new Checkbox("Singing");
         Drawing.setFont(textFont);
         Drawing.setForeground(Color.white);
         Drawing.setBounds(470,350,70,30);
         add(Drawing);

         Drawing=new Checkbox("Music");
         Drawing.setFont(textFont);
         Drawing.setForeground(Color.white);
         Drawing.setBounds(540,350,60,30);
         add(Drawing);

         Drawing=new Checkbox("Others");
         Drawing.setFont(textFont);
         Drawing.setForeground(Color.white);
         Drawing.setBounds(600,350,70,30);
         add(Drawing);

//         Address label
         lbAddress=new Label("Address:");
         lbAddress.setBounds(250,400,150,30);
         lbAddress.setFont(labelFont);
         lbAddress.setForeground(Color.white);
         add(lbAddress);

         tAddress =new TextArea();
         tAddress.setBounds(400,400,260,100);
         tAddress.setFont(textFont);
         add(tAddress);

//         save button
         btnSave =new Button("Save Button");
         btnSave.setBounds(400,510,100,30);
         btnSave.setFont(labelFont);
         btnSave.setForeground(Color.blue);
         btnSave.setBackground(Color.black);
         add(btnSave);

//         clear button
         btnClear =new Button("clear Button");
         btnClear.setBounds(510,510,100,30);
         btnClear.setFont(labelFont);
         btnClear.setForeground(Color.blue);
         btnClear.setBackground(Color.black);
         add(btnClear);
    }


    public void actionPerformed(ActionEvent e)
    {
        System.out.println(" hi devrshi you are succesfully submited!");
    }
    public static void main(String[] args)
    {

        Registration_form r=new Registration_form();
    }
}
