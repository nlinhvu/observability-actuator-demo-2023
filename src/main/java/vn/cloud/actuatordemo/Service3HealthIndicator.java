package vn.cloud.actuatordemo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class Service3HealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.status("FATAL").withDetail("LEVEL", "FATAL").build();
    }
}
