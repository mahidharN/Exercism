public class PangramChecker
{
    public boolean isPangram(String input)
    {
        long count = input.toLowerCase().chars()
                .filter(alphabet -> alphabet >= 'a' && alphabet <= 'z')
                .distinct()
                .count();

        return count == 26;
    }

}
