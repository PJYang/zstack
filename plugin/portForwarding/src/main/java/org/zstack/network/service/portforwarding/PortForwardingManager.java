package org.zstack.network.service.portforwarding;

import org.zstack.header.core.Completion;

public interface PortForwardingManager {
    PortForwardingBackend getPortForwardingBackend(String providerType, String l3NetworkUuid);

    void attachPortForwardingRule(PortForwardingStruct struct, String providerType, Completion completion);

    void detachPortForwardingRule(PortForwardingStruct struct, String providerType, Completion completion);
}
