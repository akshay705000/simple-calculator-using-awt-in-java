 import java.awt.*;
 import java.lang.*;
 import java.awt.event.*;
 import java.awt.Color;
 class AEvent extends Frame implements ActionListener{
 TextField tf;
 String m,x,c,st1,k,st2="",st3; int a,result; 
 double res;
 Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
 Checkbox ch1,ch2;
 AEvent(){
 addWindowListener(new WindowAdapter(){
 public void windowClosing(WindowEvent e) {
 dispose();
 }
 });

 //create components
 setBackground(new Color(140, 115, 115));
 ch1 = new Checkbox("sc");
 ch1.setBounds(195,330,35,35);
 tf=new TextField();tf.setBounds(30,50,200,40);
 //tf.setBackground(new color(191, 64, 64));
 b=new Button("x^2");
 b.setBounds(30,110,35,35);
 b1=new Button("e^x"
b1.setBounds(85,110,35,35);
b2=new Button("logx");
b2.setBounds(140,110,35,35);
b3=new Button("-");
b3.setBounds(195,110,35,35);
b4=new Button("9");
b4.setBounds(30,165,35,35);
b5=new Button("8");
b5.setBounds(85,165,35,35);
b6=new Button("7");
b6.setBounds(140,165,35,35);
b7=new Button("x");
b7.setBounds(195,165,35,35);
b8=new Button("6");
b8.setBounds(30,220,35,35);
b9=new Button("5");
b9.setBounds(85,220,35,35);
 b10=new Button("4");
 b10.setBounds(140,220,35,35); b11=new Button("/");
 b11.setBounds(195,220,35,35); b12=new Button("3");
 b12.setBounds(30,275,35,35);
 b13=new Button("2");
 b13.setBounds(85,275,35,35);
 b14=new Button("1");
 b14.setBounds(140,275,35,35);
 b15=new Button("+");
 b15.setBounds(195,275,35,35);
 b16=new Button("AC");
 b16.setBounds(30,330,35,35);
 b17=new Button("0");
 b17.setBounds(85,330,35,35);
 b18=new Button("=");
 b18.setBounds(140,330,35,35);
 b.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b10.addActionListener(this);
 b11.addActionListener(this);
 b12.addActionListener(this);
 CheckboxGroup cbg = new CheckboxGroup();
 ch1 = new Checkbox("sc",cbg,false);
 ch1.setBounds(195,330,35,17);
 ch1.addItemListener(new ItemListener(){ 
 public void itemStateChanged(ItemEvent l) {
 setSize(365,395);
 tf.setBounds(30,50,305,40); }
 });
 ch2 = new Checkbox("nc",cbg,true);
 ch2.setBounds(195,347,35,17);
 ch2.addItemListener(new ItemListener(){
 public void itemStateChanged(ItemEvent l) {
 setSize(258,395);
 tf.setBounds(30,50,200,40);
 }
 });
 b13.addActionListener(this);
 b14.addActionListener(this);
 b15.addActionListener(this);
 b16.addActionListener(this);
 b17.addActionListener(this);
 b18.addActionListener(this);
 c1=new Button("exp");
c1.setBounds(250,110,35,35);
 c2=new Button("log10");
 c2.setBounds(250,165,35,35);
 c3=new Button("sin");
 c3.setBounds(250,220,35,35);
 c4=new Button("cos");
 c4.setBounds(250,275,35,35);
 c5=new Button("<-");
 c5.setBounds(250,330,35,35);
 c6=new Button("tan");
 c6.setBounds(305,110,35,35);
 c7=new Button("mod");
 c7.setBounds(305,165,35,35);
 c8=new Button("%");
 c8.setBounds(305,220,35,35);
 c9=new Button("pi");
 c9.setBounds(305,275,35,35);
 c10=new Button("sqrt");
 c10.setBounds(305,330,35,35);
 add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);
 c1.addActionListener(this);
 c2.addActionListener(this);
 c3.addActionListener(this);
 c4.addActionListener(this); 
 c5.addActionListener(this);
 c6.addActionListener(this);
 c7.addActionListener(this);
 c8.addActionListener(this);
 c9.addActionListener(this);
 c10.addActionListener(this);
 tf.setBounds(30,50,305,40);
 add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);
 add(b);add(tf);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9)
;
 add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);add(c
h1);add(ch2);
 setSize(258,395);
 setLayout(null);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e){
 if(e.getSource()==b4){
 x=tf.getText();
 m=x+"9";
 k="9";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b5){
 x=tf.getText();
 m=x+"8";
 k="8";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b6){
 x=tf.getText();
 m=x+"7";
 k="7";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b8){
 x=tf.getText();
 m=x+"6";
 k="6";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b9){
 x=tf.getText();
 m=x+"5";
 k="5";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b10){
 x=tf.getText();
 m=x+"4";
 k="4";
 if(st3=="1"){
 st2="";
 st3="12";
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b12){
 x=tf.getText();
 m=x+"3";
 k="3";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b13){
 x=tf.getText();
 m=x+"2";
 k="2";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b14){
 x=tf.getText();
 m=x+"1";
 k="1";
2if(st3=="1"){
st2=""
st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b17){
 x=tf.getText();
 m=x+"0";
 k="0";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+k;
 tf.setText(m);
 }
 if(e.getSource()==b15){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"+";
 a=1;
 tf.setText(m);
 }
 if(e.getSource()==b3){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"-";
 a=2;
 tf.setText(m);
 }
 if(e.getSource()==b7){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"x";
 a=3;
 tf.setText(m);
 }
 if(e.getSource()==b11){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"/";
 a=4;
 tf.setText(m); }
 if(e.getSource()==b){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"^2";
 a=5;
 tf.setText(m);
 }
 if(e.getSource()==b1){
 x=tf.getText();
 st1=x;
 st3="1";
 m="e^"+x;
 a=6;
 tf.setText(m);
 }
 if(e.getSource()==b2){
 x=tf.getText();
 st1=x;
 st3="1";
 m="log"+x;
 a=7;
 tf.setText(m);
 }
 if(e.getSource()==b16){
 x=tf.getText();
 m="";
 tf.setText(m);
 }

 if(e.getSource()==c1){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"exp";
 a=8;
 tf.setText(m);
 }
 if(e.getSource()==c2){
 x=tf.getText();
 st1=x;
 st3="1";
 m="log10"+x;
 a=9;
 tf.setText(m);
 }
 if(e.getSource()==c3){
 x=tf.getText();
 st1=x;
 st3="1";
 m="sin"+x;
 a=10;
 tf.setText(m);
 }
 if(e.getSource()==c4){
 x=tf.getText();
 st1=x;
 st3="1";
 m="cos"+x;
 a=11;
 tf.setText(m);
 }
 if(e.getSource()==c6){
346 x=tf.getText();
 st1=x;
 st3="1";
 m="tan"+x;
 a=12;
 tf.setText(m);
 }
 if(e.getSource()==c7){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"mod";
 a=13;
 tf.setText(m);
 }
 if(e.getSource()==c8){
 x=tf.getText();
 st1=x;
 st3="1";
 m=x+"%";
 a=14;
 tf.setText(m);
 }
 if(e.getSource()==c9){
 x=tf.getText();
 m=x+"pi";
 if(st3=="1"){
 st2="";
 st3="12";
 }
 st2=st2+"3.14";
 tf.setText("3.14");
 }
 if(e.getSource()==c10){
 x=tf.getText();
 st1=x;
 st3="1";
 m="sqrt"+x;
 a=15;
 tf.setText(m); }
 if(e.getSource()==b18){
 if(a==1){
 x=tf.getText();
 res=Double.parseDouble(st1)+Double.parseDouble(st2);
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
 }
 else if(a==2){
 x=tf.getText();
 res=Double.parseDouble(st1)-Double.parseDouble(st2);
 c=String.valueOf(res);
 tf.setText(c);
 } 
 else if(a==3){
 x=tf.getText();
 res=Double.parseDouble(st1)*Double.parseDouble(st2);
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
 }
 else if(a==4){
 try{
 x=tf.getText();
 res=Double.parseDouble(st1)/Double.parseDouble(st2);
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
 }
 catch(ArithmeticException f)
 {
 tf.setText("Error:/by zero");
 }
 }
 else if(a==5){
 x=tf.getText();
 res=Double.parseDouble(st1)*Double.parseDouble(st1);
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
 }
 else if(a==7){
 x=tf.getText();
 res=Math.log(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
434 
 }
 else if(a==6){
 x=tf.getText();
 res=Math.exp(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);
 }
 else if(a==8){
 x=tf.getText();
 res=Math.pow(Double.parseDouble(st1),Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==9){
 x=tf.getText();
 res=Math.log10(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==10){
 x=tf.getText();
 res=Math.sin(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==11){
 x=tf.getText();
 res=Math.cos(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
tf.setText(c);

 }
 else if(a==12){
 x=tf.getText();
 res=Math.tan(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==13){
 x=tf.getText();
 res=Double.parseDouble(st1)%Double.parseDouble(st2);
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==14){
 x=tf.getText();
 res=(Double.parseDouble(st1)*Double.parseDouble(st2))/100;
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 else if(a==15){
 x=tf.getText();
 res=Math.sqrt(Double.parseDouble(st1));
 c=String.valueOf(res);
 c=x+"="+c;
 tf.setText(c);

 }
 }

 }
 public static void main(String args[]){
 new AEvent();
 }
 }
 
