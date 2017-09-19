class Party{
        public void buildInvite(){
        Frame f = new Frame();
        Label l = new Label("Party at Tim's");
        Button B = new Button("You Bet");
        Button c = new Button("Shoot me");
        Panel p = new Panel();
        p.add(l);
        p.add(B);
        p.add(c);
        f.add(p);
        f.setVisible(true);
        }

        public static void main(String[] args) {
            new Party().buildInvite();
        }
    }