class psgcollege{
public void college(){
System.out.println("It is located in sitra");
}}
class hindhustan extends psgcollege{
public void college(){
System.out.println("It is located in Navaindia");
}}
class kgisl extends hindhustan{
public void college(){
System.out.println("It is loacated in saravanampatti");
}}
class Polymorphism{
public static void main(String[] args){
psgcollege col = new psgcollege();
col.college();
psgcollege hind = new hindhustan();
hind.college();
psgcollege kgm = new kgisl();
kgm.college();
}

}