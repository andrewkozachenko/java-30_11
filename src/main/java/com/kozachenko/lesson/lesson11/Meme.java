package com.kozachenko.lesson.lesson11;

public class Meme {
    private Joke joke;
    private String memeMsg = "Meme";

   class Joke{
        private String joke = memeMsg+ "Ha-Ha-Ha-Ha!";
//        private String joke;

        public void sayJoke(){
           System.out.println(joke);
//           if(joke == null){
//               System.out.println("Ha-Ha-Ha-Ha!");
//           } else {
//               System.out.println(joke);
//           }
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }
    }

    public void setJoke(Joke newJoke) {
        this.joke = newJoke;
    }

    public void showMeme(){
        System.out.println(joke.joke);
        System.out.println();
        this.joke.sayJoke();
    }
}
