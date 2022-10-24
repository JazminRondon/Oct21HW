package extendskeyword;
//Number is a built in class!!
class NumbersPair <T extends Number>{
    private T first;
    private T second;

    public NumbersPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "NumbersPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
