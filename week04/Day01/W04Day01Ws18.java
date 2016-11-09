
public class W04Day01Ws18 {
    public static void main(String... args){
        String example = "A long example string";

        example.replace("long", "short");
        StringBuilder sjat= new StringBuilder(example);
        sjat.replace(2,6, "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string


        System.out.println(sjat);
    }
}