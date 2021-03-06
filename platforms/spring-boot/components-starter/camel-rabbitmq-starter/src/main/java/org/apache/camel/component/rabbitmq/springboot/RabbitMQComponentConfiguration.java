/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.rabbitmq.springboot;

import java.util.Map;
import javax.annotation.Generated;
import javax.net.ssl.TrustManager;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The rabbitmq component allows you produce and consume messages from RabbitMQ
 * instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.rabbitmq")
public class RabbitMQComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * The hostname of the running rabbitmq instance or cluster.
     */
    private String hostname;
    /**
     * Port number for the host with the running rabbitmq instance or cluster.
     */
    private Integer portNumber = 5672;
    /**
     * Username in case of authenticated access
     */
    private String username = "guest";
    /**
     * Password for authenticated access
     */
    private String password = "guest";
    /**
     * The vhost for the channel
     */
    private String vhost = "/";
    /**
     * If this option is set, camel-rabbitmq will try to create connection based
     * on the setting of option addresses. The addresses value is a string which
     * looks like server1:12345, server2:12345
     */
    private String addresses;
    /**
     * To use a custom RabbitMQ connection factory. When this option is set, all
     * connection options (connectionTimeout, requestedChannelMax...) set on URI
     * are not used
     */
    @NestedConfigurationProperty
    private ConnectionFactory connectionFactory;
    /**
     * The consumer uses a Thread Pool Executor with a fixed number of threads.
     * This setting allows you to set that number of threads.
     */
    private Integer threadPoolSize = 10;
    /**
     * Whether to auto-detect looking up RabbitMQ connection factory from the
     * registry. When enabled and a single instance of the connection factory is
     * found then it will be used. An explicit connection factory can be
     * configured on the component or endpoint level which takes precedence.
     */
    private Boolean autoDetectConnectionFactory = true;
    /**
     * Connection timeout
     */
    private Integer connectionTimeout = 60000;
    /**
     * Connection requested channel max (max number of channels offered)
     */
    private Integer requestedChannelMax = 0;
    /**
     * Connection requested frame max (max size of frame offered)
     */
    private Integer requestedFrameMax = 0;
    /**
     * Connection requested heartbeat (heart-beat in seconds offered)
     */
    private Integer requestedHeartbeat = 60;
    /**
     * Enables connection automatic recovery (uses connection implementation
     * that performs automatic recovery when connection shutdown is not
     * initiated by the application)
     */
    private Boolean automaticRecoveryEnabled;
    /**
     * Network recovery interval in milliseconds (interval used when recovering
     * from network failure)
     */
    private Integer networkRecoveryInterval = 5000;
    /**
     * Enables connection topology recovery (should topology recovery be
     * performed)
     */
    private Boolean topologyRecoveryEnabled;
    /**
     * Enables the quality of service on the RabbitMQConsumer side. You need to
     * specify the option of prefetchSize, prefetchCount, prefetchGlobal at the
     * same time
     */
    private Boolean prefetchEnabled = false;
    /**
     * The maximum amount of content (measured in octets) that the server will
     * deliver, 0 if unlimited. You need to specify the option of prefetchSize,
     * prefetchCount, prefetchGlobal at the same time
     */
    private Integer prefetchSize;
    /**
     * The maximum number of messages that the server will deliver, 0 if
     * unlimited. You need to specify the option of prefetchSize, prefetchCount,
     * prefetchGlobal at the same time
     */
    private Integer prefetchCount;
    /**
     * If the settings should be applied to the entire channel rather than each
     * consumer You need to specify the option of prefetchSize, prefetchCount,
     * prefetchGlobal at the same time
     */
    private Boolean prefetchGlobal = false;
    /**
     * Get maximum number of opened channel in pool
     */
    private Integer channelPoolMaxSize = 10;
    /**
     * Set the maximum number of milliseconds to wait for a channel from the
     * pool
     */
    private Long channelPoolMaxWait = 1000L;
    /**
     * Set timeout for waiting for a reply when using the InOut Exchange Pattern
     * (in milliseconds)
     */
    private Long requestTimeout = 20000L;
    /**
     * Set requestTimeoutCheckerInterval for inOut exchange
     */
    private Long requestTimeoutCheckerInterval = 1000L;
    /**
     * When true and an inOut Exchange failed on the consumer side send the
     * caused Exception back in the response
     */
    private Boolean transferException = false;
    /**
     * When true, the message will be published with publisher acknowledgements
     * turned on
     */
    private Boolean publisherAcknowledgements = false;
    /**
     * The amount of time in milliseconds to wait for a basic.ack response from
     * RabbitMQ server
     */
    private Long publisherAcknowledgementsTimeout;
    /**
     * When true, an exception will be thrown when the message cannot be
     * delivered (basic.return) and the message is marked as mandatory.
     * PublisherAcknowledgement will also be activated in this case. See also
     * publisher acknowledgements - When will messages be confirmed.
     */
    private Boolean guaranteedDeliveries = false;
    /**
     * This flag tells the server how to react if the message cannot be routed
     * to a queue. If this flag is set, the server will return an unroutable
     * message with a Return method. If this flag is zero, the server silently
     * drops the message. If the header is present rabbitmq.MANDATORY it will
     * override this option.
     */
    private Boolean mandatory = false;
    /**
     * This flag tells the server how to react if the message cannot be routed
     * to a queue consumer immediately. If this flag is set, the server will
     * return an undeliverable message with a Return method. If this flag is
     * zero, the server will queue the message, but with no guarantee that it
     * will ever be consumed. If the header is present rabbitmq.IMMEDIATE it
     * will override this option.
     */
    private Boolean immediate = false;
    /**
     * Specify arguments for configuring the different RabbitMQ concepts, a
     * different prefix is required for each: Exchange: arg.exchange. Queue:
     * arg.queue. Binding: arg.binding. For example to declare a queue with
     * message ttl argument:
     * http://localhost:5672/exchange/queueargs=arg.queue.x-message-ttl=60000
     */
    private Map<String, Object> args;
    /**
     * Connection client properties (client info used in negotiating with the
     * server)
     */
    private Map<String, Object> clientProperties;
    /**
     * Enables SSL on connection, accepted value are true, TLS and 'SSLv3
     */
    private String sslProtocol;
    /**
     * Configure SSL trust manager, SSL should be enabled for this option to be
     * effective
     */
    private TrustManager trustManager;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Integer getThreadPoolSize() {
        return threadPoolSize;
    }

    public void setThreadPoolSize(Integer threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    public Boolean getAutoDetectConnectionFactory() {
        return autoDetectConnectionFactory;
    }

    public void setAutoDetectConnectionFactory(
            Boolean autoDetectConnectionFactory) {
        this.autoDetectConnectionFactory = autoDetectConnectionFactory;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getRequestedChannelMax() {
        return requestedChannelMax;
    }

    public void setRequestedChannelMax(Integer requestedChannelMax) {
        this.requestedChannelMax = requestedChannelMax;
    }

    public Integer getRequestedFrameMax() {
        return requestedFrameMax;
    }

    public void setRequestedFrameMax(Integer requestedFrameMax) {
        this.requestedFrameMax = requestedFrameMax;
    }

    public Integer getRequestedHeartbeat() {
        return requestedHeartbeat;
    }

    public void setRequestedHeartbeat(Integer requestedHeartbeat) {
        this.requestedHeartbeat = requestedHeartbeat;
    }

    public Boolean getAutomaticRecoveryEnabled() {
        return automaticRecoveryEnabled;
    }

    public void setAutomaticRecoveryEnabled(Boolean automaticRecoveryEnabled) {
        this.automaticRecoveryEnabled = automaticRecoveryEnabled;
    }

    public Integer getNetworkRecoveryInterval() {
        return networkRecoveryInterval;
    }

    public void setNetworkRecoveryInterval(Integer networkRecoveryInterval) {
        this.networkRecoveryInterval = networkRecoveryInterval;
    }

    public Boolean getTopologyRecoveryEnabled() {
        return topologyRecoveryEnabled;
    }

    public void setTopologyRecoveryEnabled(Boolean topologyRecoveryEnabled) {
        this.topologyRecoveryEnabled = topologyRecoveryEnabled;
    }

    public Boolean getPrefetchEnabled() {
        return prefetchEnabled;
    }

    public void setPrefetchEnabled(Boolean prefetchEnabled) {
        this.prefetchEnabled = prefetchEnabled;
    }

    public Integer getPrefetchSize() {
        return prefetchSize;
    }

    public void setPrefetchSize(Integer prefetchSize) {
        this.prefetchSize = prefetchSize;
    }

    public Integer getPrefetchCount() {
        return prefetchCount;
    }

    public void setPrefetchCount(Integer prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    public Boolean getPrefetchGlobal() {
        return prefetchGlobal;
    }

    public void setPrefetchGlobal(Boolean prefetchGlobal) {
        this.prefetchGlobal = prefetchGlobal;
    }

    public Integer getChannelPoolMaxSize() {
        return channelPoolMaxSize;
    }

    public void setChannelPoolMaxSize(Integer channelPoolMaxSize) {
        this.channelPoolMaxSize = channelPoolMaxSize;
    }

    public Long getChannelPoolMaxWait() {
        return channelPoolMaxWait;
    }

    public void setChannelPoolMaxWait(Long channelPoolMaxWait) {
        this.channelPoolMaxWait = channelPoolMaxWait;
    }

    public Long getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Long requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public Long getRequestTimeoutCheckerInterval() {
        return requestTimeoutCheckerInterval;
    }

    public void setRequestTimeoutCheckerInterval(
            Long requestTimeoutCheckerInterval) {
        this.requestTimeoutCheckerInterval = requestTimeoutCheckerInterval;
    }

    public Boolean getTransferException() {
        return transferException;
    }

    public void setTransferException(Boolean transferException) {
        this.transferException = transferException;
    }

    public Boolean getPublisherAcknowledgements() {
        return publisherAcknowledgements;
    }

    public void setPublisherAcknowledgements(Boolean publisherAcknowledgements) {
        this.publisherAcknowledgements = publisherAcknowledgements;
    }

    public Long getPublisherAcknowledgementsTimeout() {
        return publisherAcknowledgementsTimeout;
    }

    public void setPublisherAcknowledgementsTimeout(
            Long publisherAcknowledgementsTimeout) {
        this.publisherAcknowledgementsTimeout = publisherAcknowledgementsTimeout;
    }

    public Boolean getGuaranteedDeliveries() {
        return guaranteedDeliveries;
    }

    public void setGuaranteedDeliveries(Boolean guaranteedDeliveries) {
        this.guaranteedDeliveries = guaranteedDeliveries;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean getImmediate() {
        return immediate;
    }

    public void setImmediate(Boolean immediate) {
        this.immediate = immediate;
    }

    public Map<String, Object> getArgs() {
        return args;
    }

    public void setArgs(Map<String, Object> args) {
        this.args = args;
    }

    public Map<String, Object> getClientProperties() {
        return clientProperties;
    }

    public void setClientProperties(Map<String, Object> clientProperties) {
        this.clientProperties = clientProperties;
    }

    public String getSslProtocol() {
        return sslProtocol;
    }

    public void setSslProtocol(String sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    public TrustManager getTrustManager() {
        return trustManager;
    }

    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}