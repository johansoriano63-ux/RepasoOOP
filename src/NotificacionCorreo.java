public class NotificacionCorreo extends Notificacion {

    public NotificacionCorreo(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @java.lang.Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Correo: " + mensaje + " a: " + receptorNotificacion);
    }
}
