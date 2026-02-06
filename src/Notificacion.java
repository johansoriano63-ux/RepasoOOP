public abstract class Notificacion {
    protected final String receptorNotificacion;

    public Notificacion(String receptorNotificacion){
        if(receptorNotificacion= null || receptorNotificacion.isBlank()){
            throw new IllegalArgumentExcpetion("El receptor es invalido");
        }
        this.receptorNotificacion = receptorNotificacion;
    }

    public abstract void enviarMensaje ( String mensaje);
}
