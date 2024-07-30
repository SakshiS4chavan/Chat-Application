package in.sp.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer { //implemennt beacuse to establish connection between server & client
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws").withSockJS();

}
	@Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
	}
}

//@EnablewebSocketMessageBroker=this annotation is used to enable the websocket server.it also implement the WebSocketMessageBrokerConfigurer interface 
//in order to provide definitions or logic to some of its methods to establish WebSocket connection


//@Override
//public void registerStompEndpoints(StompEndpointRegistry registry) {
//	registry.addEndpoint("/ws").withSockJS();
//} in this method ws=client will use to establish connection with our WebSocket server.Stomp=method name.all methods cone from the STOMP implements in 
	//spring framework.STOMP=Simple Text Oriented Messaging Protocol.it is messaging protocol that defines the rules and format data exchanging between
//server & client.websocket is failed to identify particular users.STOMP=is used to send message to particular user.


//@Override
//public void configureMessageBroke(MessageBrokerRegistry registry) {
//	registry.setApplicationDestinationPrefixes("/app");
//	registry.enableSimpleBroker("/topic");
//}this methos is used to route the message from one client to another client who is in the group chat.when one user sends the message in the group chat
//it appears in front of all the group members.registry.setApplicationDestinationPrefixes("/app");is is used to define messages whose destinations starts with
//app & is should be routed to message handling..registry.enableSimpleBroker("/topic");it is used to messages whose destination starts with topics and it 
//should be routed to message broker.& message broker will broadcast the messages to all the connected users or clients who subscribed to topic.
























