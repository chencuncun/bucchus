CREATE TABLE public.shop
(
  shop_id integer NOT NULL DEFAULT nextval('shop_info_shop_id_seq'::regclass),
  shop_name character varying(50),
  shop_prefecture character varying(6),
  shop_city character varying(100),
  building_name character varying(50),
  nearest_station character varying(50),
  shop_phone_number character varying(12),
  shop_url character varying(2083)[],
  recommand_count integer,
  CONSTRAINT shop_info_pkey PRIMARY KEY (shop_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.shop