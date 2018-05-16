import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by AB on 12-Dec-17.
 */
public class Bot extends TelegramLongPollingBot{

    public String getBotToken() {
        return "448634762:AAHJ-AhkJrUf83CL5P-sX-OrrGR_Q6NgLoQ";
    }

    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getFrom().getFirstName() + ": " + update.getMessage().getText());

//        Send Message
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        sendMessage.setText("Hello: " + update.getMessage().getFrom().getFirstName() + "\n" + update.getMessage().getText());

        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return null;
    }
}
