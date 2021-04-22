import java.util.ArrayList; //arraylist is the dynamic version of array 
public class arrayList {
    public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    System.out.println(list1.size());
    list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    list1.add(50);
    list1.add(0, 0);
    System.out.println(list1.size());
    for(int i=0;i<list1.size();i++){  // saare element ko ek ek krke print krna hai toh for loop use kr rhe hai 
        System.out.println(list1.get(i) + " " );
    }
                // we are using for each loop this is used to get values directly pr jb hum for loop use krte hai
                //usme hum index pr jakr phir value ki read krte hai pr yha directly krta hai ye 
     for(int element : list1) // for each element in list 1 
     System.out.println(element + " ");
    // for each loop hum quick traversal ke liye krte hai changes  krne hai list mr krne hai toh for each nhi use kr sakte

    list1.remove(0); // remove kr dega ye 0 ki jagah pr jo hoga or phir list print kr dega new 
    for(int i=0;i<list1.size();i++){
        System.out.println(list1.get(i) + " ");
    }
    list1.set(2, 5);  // ye value ovverride kr deta hai size pr farak nhi padta pr add me size change ho jata hai 
    for(int i=0;i<list1.size();i++){
        System.out.println(list1.get(i)+ " ");
    }

    }
}
