FROM grafana/grafana

RUN mkdir -p /var/lib/grafana/dashboards

COPY [ "./provisioning/datasource.yml", "/etc/grafana/provisioning/datasources/datasource.yml" ]
COPY [ "./provisioning/dashboards.yml", "/etc/grafana/provisioning/dashboards/dashboards.yml"  ]
COPY [ "./dashboards/*.json", "/var/lib/grafana/dashboards/" ]

