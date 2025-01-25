tb1.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                if(tb1.getText().equals("Username")){
                    tb1.setText("");
                }
            }
            public void focusLost(FocusEvent e){
                if(tb1.getText().isEmpty()){
                    tb1.setText("Username");
                }
            }
        });
tb2.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                if(tb2.getText().equals("Password")){
                    tb2.setText("");
                }
            }
            public void focusLost(FocusEvent e){
                if(tb2.getText().isEmpty()){
                    tb2.setText("Password");
                }
            }
        });