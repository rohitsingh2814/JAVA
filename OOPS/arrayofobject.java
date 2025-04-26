

class subject{
    private String subid;
    private String subname;
    private int maxMarks;
    private int marksobt;
 
 public subject(String subid,String subname,int maxMarks){
    this.subid=subid;
    this.subname=subname;
    this.maxMarks=maxMarks;

 }
 public int getmarks(){
    return marksobt;
 }
 public void setmarks(int mark){
    marksobt=mark;
 }
  
public String toString(){
    return "SubjectId: "+subid+"\nSubjectName: "+subname+"\nMaxmarks: "+maxMarks+"\nMarksObtained: "+marksobt+"\n";
}

}

class arrayofobject{
    public static void main(String[] args) {
        subject subs[]=new subject[3];
        subs[0]=new subject("s101","DS",100);
        subs[1]=new subject("s202","Ml",100);
        subs[2]=new subject("s303","os",100);
    
     subs[0].setmarks(56);
     subs[1].setmarks(40);
     subs[2].setmarks(43);


        for(subject s:subs){
            System.out.println(s);
        }
    }
}