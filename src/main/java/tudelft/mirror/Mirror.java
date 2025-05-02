package tudelft.mirror;
//se corrigio el error, ya que el metodo compara caracteres desde el incio a fin hasta encontrar discrepancia
public class Mirror {
    public String mirrorEnds(String s) {
        StringBuilder mirrored = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                mirrored.append(s.charAt(i));
            } else {
                break;
            }
        }
        return mirrored.toString();
    }
}