class ChickenEgg{
  int state = 0;
  
  ChickenEgg(){
  
  }
  
  private void changeState(char input){
    switch(state){
      case 0:
        switch(input){
          case '0': case '1': case '2': case '3':
            state = 1;
            break;
          default:
            state = 13;
            break;
        }
        break;
      case 1:
        switch(input){
          case '-':
            state = 2;
            break;
          default:
            state = 13;
            break;
        }
        break;
      case 2:
        switch(input){
          case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': case 'J': case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z':
            state = 3;
            break;
          default:
            state = 13;
            break;
        }
        break;
      case 3:
        switch(input){
          case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': case 'J': case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z':
            state = 4;
            break;
          default: 
            state = 13;
            break;
        }
        break;
      case 4:
        switch(input){
          case '-':
            state = 5;
            break;
          default:
            state = 13;
            break;
        }
        break;
        case 5:
          switch(input){
            case '0': case '1':
              state = 6;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 6:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 7;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 7:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 8;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 8:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 9;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 9:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 10;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 10:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 11;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 11:
          switch(input){
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
              state = 12;
              break;
            default:
              state = 13;
              break;
          }
          break;
        case 12:
          state = 13;
          break;
        case 13:
          state = 13;
          break;
        default:
          case = 13;
          break;
    }
  }
  
  public boolean isWordOfLanguage(String word){
    for(int i = 0; i<word.length; i++){
      changeState(word.charAt(i));
    }
    if(state == 12){
      return true;
    }
    else{
      return false;
    }
  }
}
