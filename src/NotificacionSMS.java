public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @java.lang.Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS: " + mensaje + " a: " + receptorNotificacion);
    }
}
