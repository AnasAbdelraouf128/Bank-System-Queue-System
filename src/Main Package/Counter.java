// Counter.java
public class Counter {

// بيانات الشباك
private int counterNo;
private Teller currentTeller; // الموظف على الشباك
private boolean isOpen;// الشباك فاتح ولا مقفول

 // الكونستركتور
public Counter(int counterNo) {
 this.counterNo = counterNo;
this.isOpen = false; // بيبدأ مقفول
 this.currentTeller = null; // ومفيش موظف
}

 // حط موظف على الشباك
public void assignTeller(Teller teller) {
 this.currentTeller = teller;
 // لو الموظف موجود، افتح الشباك أوتوماتيك
 if (teller != null) {
 this.isOpen = true;
 }
 }

// قفل الشباك وشيل الموظف
 public void closeCounter() {
 this.currentTeller = null;
 this.isOpen = false;
}

 // افتح الشباك يدوي (لازم يكون فيه موظف)
 public void openCounter() {
 if (currentTeller != null) {
 this.isOpen = true;
 }
 }

// --- Getters ---
 public int getCounterNo() {
return counterNo;
 }

 public Teller getCurrentTeller() {
 return currentTeller;
 }

 public boolean isOpen() {
 return isOpen;
 }

// الطباعة بشكل منظم عشان البونص يبوالسييد
 @Override
 public String toString() {
 String status = isOpen ? "Open" : "Closed";
 String name = (currentTeller != null) ? currentTeller.getName() : "None";
 return "Counter #" + counterNo + " [" + status + "] - Teller: " + name;
  }
}