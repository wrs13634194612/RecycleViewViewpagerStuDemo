package com.example.iosdialogdemo.bean;





        import java.util.List;

public class StuBean {

    /**
     * sch_num : 1086
     * sch_ready_ed : 2
     * sch_ready_ing : 6
     * sch_ready_not : 1080
     * sch_ready_ing_list : [{"stu_id":223,"stu_name":"误解者","stu_status":"0","item_status":"2","stu_url":"https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg","stu_sex":"女","stu_birth":"1985-04-17","stu_addr":"四川成都","col_id":3,"grade_id":null,"col_name":"南阳理工学院","grade_name":"三年级一班"},{"stu_id":255,"stu_name":"詹姆斯","stu_status":"0","item_status":"2","stu_url":"https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg","stu_sex":"男","stu_birth":"1993-01-25","stu_addr":null,"col_id":3,"grade_id":null,"col_name":"南阳理工学院","grade_name":"三年级一班"}]
     * class_list : [{"class_name":255,"stu_name":"詹姆斯","stu_status":"0","item_status":"2","stu_url":"https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg","stu_sex":"男","stu_birth":"1993-01-25","stu_addr":null,"col_id":3,"grade_id":null,"col_name":"南阳理工学院","grade_name":"三年级一班"},{"class_name":255,"stu_name":"詹姆斯","stu_status":"0","item_status":"2","stu_url":"https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg","stu_sex":"男","stu_birth":"1993-01-25","stu_addr":null,"col_id":3,"grade_id":null,"col_name":"南阳理工学院","grade_name":"三年级一班"}]
     */

    private int sch_num;
    private int sch_ready_ed;
    private int sch_ready_ing;
    private int sch_ready_not;
    private List<SchReadyIngListBean> sch_ready_ing_list;
    private List<ClassListBean> class_list;

    public int getSch_num() {
        return sch_num;
    }

    public void setSch_num(int sch_num) {
        this.sch_num = sch_num;
    }

    public int getSch_ready_ed() {
        return sch_ready_ed;
    }

    public void setSch_ready_ed(int sch_ready_ed) {
        this.sch_ready_ed = sch_ready_ed;
    }

    public int getSch_ready_ing() {
        return sch_ready_ing;
    }

    public void setSch_ready_ing(int sch_ready_ing) {
        this.sch_ready_ing = sch_ready_ing;
    }

    public int getSch_ready_not() {
        return sch_ready_not;
    }

    public void setSch_ready_not(int sch_ready_not) {
        this.sch_ready_not = sch_ready_not;
    }

    public List<SchReadyIngListBean> getSch_ready_ing_list() {
        return sch_ready_ing_list;
    }

    public void setSch_ready_ing_list(List<SchReadyIngListBean> sch_ready_ing_list) {
        this.sch_ready_ing_list = sch_ready_ing_list;
    }

    public List<ClassListBean> getClass_list() {
        return class_list;
    }

    public void setClass_list(List<ClassListBean> class_list) {
        this.class_list = class_list;
    }

    public static class SchReadyIngListBean {
        /**
         * stu_id : 223
         * stu_name : 误解者
         * stu_status : 0
         * item_status : 2
         * stu_url : https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg
         * stu_sex : 女
         * stu_birth : 1985-04-17
         * stu_addr : 四川成都
         * col_id : 3
         * grade_id : null
         * col_name : 南阳理工学院
         * grade_name : 三年级一班
         */

        private int stu_id;
        private String stu_name;
        private String stu_status;
        private String item_status;
        private String stu_url;
        private String stu_sex;
        private String stu_birth;
        private String stu_addr;
        private int col_id;
        private Object grade_id;
        private String col_name;
        private String grade_name;

        public int getStu_id() {
            return stu_id;
        }

        public void setStu_id(int stu_id) {
            this.stu_id = stu_id;
        }

        public String getStu_name() {
            return stu_name;
        }

        public void setStu_name(String stu_name) {
            this.stu_name = stu_name;
        }

        public String getStu_status() {
            return stu_status;
        }

        public void setStu_status(String stu_status) {
            this.stu_status = stu_status;
        }

        public String getItem_status() {
            return item_status;
        }

        public void setItem_status(String item_status) {
            this.item_status = item_status;
        }

        public String getStu_url() {
            return stu_url;
        }

        public void setStu_url(String stu_url) {
            this.stu_url = stu_url;
        }

        public String getStu_sex() {
            return stu_sex;
        }

        public void setStu_sex(String stu_sex) {
            this.stu_sex = stu_sex;
        }

        public String getStu_birth() {
            return stu_birth;
        }

        public void setStu_birth(String stu_birth) {
            this.stu_birth = stu_birth;
        }

        public String getStu_addr() {
            return stu_addr;
        }

        public void setStu_addr(String stu_addr) {
            this.stu_addr = stu_addr;
        }

        public int getCol_id() {
            return col_id;
        }

        public void setCol_id(int col_id) {
            this.col_id = col_id;
        }

        public Object getGrade_id() {
            return grade_id;
        }

        public void setGrade_id(Object grade_id) {
            this.grade_id = grade_id;
        }

        public String getCol_name() {
            return col_name;
        }

        public void setCol_name(String col_name) {
            this.col_name = col_name;
        }

        public String getGrade_name() {
            return grade_name;
        }

        public void setGrade_name(String grade_name) {
            this.grade_name = grade_name;
        }
    }

    public static class ClassListBean {
        /**
         * class_name : 255
         * stu_name : 詹姆斯
         * stu_status : 0
         * item_status : 2
         * stu_url : https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg
         * stu_sex : 男
         * stu_birth : 1993-01-25
         * stu_addr : null
         * col_id : 3
         * grade_id : null
         * col_name : 南阳理工学院
         * grade_name : 三年级一班
         */

        private int class_name;
        private String stu_name;
        private String stu_status;
        private String item_status;
        private String stu_url;
        private String stu_sex;
        private String stu_birth;
        private Object stu_addr;
        private int col_id;
        private Object grade_id;
        private String col_name;
        private String grade_name;

        public int getClass_name() {
            return class_name;
        }

        public void setClass_name(int class_name) {
            this.class_name = class_name;
        }

        public String getStu_name() {
            return stu_name;
        }

        public void setStu_name(String stu_name) {
            this.stu_name = stu_name;
        }

        public String getStu_status() {
            return stu_status;
        }

        public void setStu_status(String stu_status) {
            this.stu_status = stu_status;
        }

        public String getItem_status() {
            return item_status;
        }

        public void setItem_status(String item_status) {
            this.item_status = item_status;
        }

        public String getStu_url() {
            return stu_url;
        }

        public void setStu_url(String stu_url) {
            this.stu_url = stu_url;
        }

        public String getStu_sex() {
            return stu_sex;
        }

        public void setStu_sex(String stu_sex) {
            this.stu_sex = stu_sex;
        }

        public String getStu_birth() {
            return stu_birth;
        }

        public void setStu_birth(String stu_birth) {
            this.stu_birth = stu_birth;
        }

        public Object getStu_addr() {
            return stu_addr;
        }

        public void setStu_addr(Object stu_addr) {
            this.stu_addr = stu_addr;
        }

        public int getCol_id() {
            return col_id;
        }

        public void setCol_id(int col_id) {
            this.col_id = col_id;
        }

        public Object getGrade_id() {
            return grade_id;
        }

        public void setGrade_id(Object grade_id) {
            this.grade_id = grade_id;
        }

        public String getCol_name() {
            return col_name;
        }

        public void setCol_name(String col_name) {
            this.col_name = col_name;
        }

        public String getGrade_name() {
            return grade_name;
        }

        public void setGrade_name(String grade_name) {
            this.grade_name = grade_name;
        }
    }
}
