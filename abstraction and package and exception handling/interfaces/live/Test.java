package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test
{
 public static void main(String[] args)
{
 Playable v=new Veena();
 Playable s=new Saxophone();
 v.play();
 s.play();
}
}