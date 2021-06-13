package day13final;
//修饰成员变量
public class member01 {
//    final private String person ="赵丽颖";

  /*  通过直接赋值
  public member01() {

    }

   *//* public member01(String person) {
        this.person = person;
    }*//*

    public String getPerson() {
        return person;
    }

    *//*public void setPerson(String person) {
        this.person = person;
    }*/
  final private String person ;
          public member01() {
        person="张翰";
          }

           public member01(String person) {
                   this.person = person;
        }

        public String getPerson() {
                return person;
                }


        }
