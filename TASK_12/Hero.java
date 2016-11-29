class Game{
  Hero h = new Hero();
  ArrayList<Wall> walls = new ArrayList<>();
  abstract class Element{
    private int x,y;
    public int getX(){
      return x;
    }
    public int getY(){
      return y;
    }
  }
  /*
  * Game g = new Game(3,2,new int[][]{{3,0},{1,1},{5,4}});
  * Hero is at 3,2 and there is 3 walls
  */
  Game(int hx,int hy,int coords[][]){
    Hero h = new Hero(hx,hy);
  }
  class Wall extends Element{
    Wall(int x,int y){

    }
  }
  class Hero extends Element{
    Hero(int x,int y){

    }
    public void move(String direction){
      if (direction.equals("LEFT")){

      }
      else if (direction.equals("RIGHT")){

      }
      else if (direction.equals("TOP")){

      }
      else {

      }
    }
  }
}
