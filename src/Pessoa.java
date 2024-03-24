class Pessoa implements Comparable<Pessoa> {
    private int age;
    private String name;

    public Pessoa(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

}